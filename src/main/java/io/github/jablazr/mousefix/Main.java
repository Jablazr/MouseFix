package io.github.jablazr.mousefix;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.mouse.NativeMouseListener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
  public static final String MODID = "mousefix";
  public static final String VERSION = "0.1.0";

  @EventHandler
  public void init(FMLInitializationEvent event) {
    try {
      GlobalScreen.registerNativeHook();
    } catch (NativeHookException ex) {
      System.err.println("There was a problem registering the native hook.");
      System.err.println(ex.getMessage());

      System.exit(1);
    }

    // Get the logger for "com.github.kwhat.jnativehook" and set the level to off.
    Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
    logger.setLevel(Level.OFF);

    // Don't forget to disable the parent handlers.
    logger.setUseParentHandlers(false);

    MouseListener mouseListener = new MouseListener();

    GlobalScreen.addNativeMouseListener((NativeMouseListener) mouseListener);
  }
}
