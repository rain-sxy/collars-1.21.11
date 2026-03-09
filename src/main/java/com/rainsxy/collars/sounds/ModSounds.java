package com.rainsxy.collars.sounds;

import com.rainsxy.collars.Collars;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModSounds {
    public static final SoundEvent CLICKER_ON = registerSound("clicker_on", 16.0f);
    public static final SoundEvent CLICKER_OFF = registerSound("clicker_off", 16.0f);

    public static SoundEvent registerSound(String name, float fixedRange) {
        Identifier id = Identifier.of(Collars.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, new SoundEvent(id, Optional.of(fixedRange)));
    }

    public static void registerModSounds() {
        Collars.LOGGER.info("Registering Mod Sounds for " + Collars.MOD_ID);
    }
}
