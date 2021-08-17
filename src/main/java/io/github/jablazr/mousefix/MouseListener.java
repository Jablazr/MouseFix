package io.github.jablazr.mousefix;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MouseListener implements NativeMouseInputListener {
  private float fov;
  // fov
  // Normal: 70.0
  // 100: 100.0
  // 30: 30.0
  // Quake Pro: 110.0
  private final float zoomMultiplier = 0.25f;

  @Override
  public void nativeMousePressed(NativeMouseEvent nativeEvent) {
    int button = nativeEvent.getButton();

    // toggle f5
    if (button == 5) {
      Minecraft mc = Minecraft.getMinecraft();

      if (mc.gameSettings.thirdPersonView == 2) {
        mc.gameSettings.thirdPersonView = 0;
      } else {
        mc.gameSettings.thirdPersonView += 1;
      }
    }

    // zoom on
    if (button == 4) {
      Minecraft mc = Minecraft.getMinecraft();

      fov = mc.gameSettings.fovSetting;

      mc.gameSettings.fovSetting *= zoomMultiplier;
    }
  }

  @Override
  public void nativeMouseReleased(NativeMouseEvent nativeEvent) {
    int button = nativeEvent.getButton();

    // zoom off
    if (button == 4) {
      Minecraft mc = Minecraft.getMinecraft();

      mc.gameSettings.fovSetting = fov;
    }
  }

  @Override
  public void nativeMouseClicked(NativeMouseEvent nativeEvent) {
    // TODO Auto-generated method stub

  }

  @Override
  public void nativeMouseMoved(NativeMouseEvent nativeEvent) {
    // TODO Auto-generated method stub

  }

  @Override
  public void nativeMouseDragged(NativeMouseEvent nativeEvent) {
    // TODO Auto-generated method stub

  }
}