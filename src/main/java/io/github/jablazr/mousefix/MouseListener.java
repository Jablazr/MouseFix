package io.github.jablazr.mousefix;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MouseListener implements NativeMouseInputListener {
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

      // System.out.println(mc.gameSettings.thirdPersonView);
    }

    // toggle zoom
    if (button == 4) {
      Minecraft mc = Minecraft.getMinecraft();
    }
  }

  @Override
  public void nativeMouseClicked(NativeMouseEvent nativeEvent) {
    // TODO Auto-generated method stub

  }

  @Override
  public void nativeMouseReleased(NativeMouseEvent nativeEvent) {
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