package com.jakehemmerle.letsmod.client.handler;


import com.jakehemmerle.letsmod.client.settings.Keybindings;
import com.jakehemmerle.letsmod.reference.Key;
import com.jakehemmerle.letsmod.utility.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

public class KeybindingInputEventHandler {

    @SubscribeEvent
    public void handleKeyInputEvent (InputEvent.KeyInputEvent event) {
        LogHelper.info(getKeyBindingPressed());
    }

    private static Key getKeyBindingPressed() {
        if (Keybindings.charge.isPressed()) {
            return Key.CHARGE;
        }

        else if (Keybindings.release.isPressed()) {
            return Key.RELEASE;
        }

        return Key.UNKNOWN;
    }
}
