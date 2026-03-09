package com.rainsxy.collars.item.custom;

import com.rainsxy.collars.sounds.ModSounds;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ClickerItem extends Item {
    public ClickerItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult use(World world, PlayerEntity user, Hand hand) {
        user.setCurrentHand(hand);
        if (!world.isClient()) {
            world.playSound(null, user.getBlockPos(),
                    ModSounds.CLICKER_ON,
                    SoundCategory.PLAYERS,
                    1.0F, 1.0F);
        }

        return super.use(world, user, hand);
    }

    @Override
    public boolean onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!world.isClient()) {
            world.playSound(null, user.getBlockPos(),
                    ModSounds.CLICKER_OFF,
                    SoundCategory.PLAYERS,
                    1.0F, 1.0F);
        }

        return super.onStoppedUsing(stack, world, user, remainingUseTicks);
    }
}
