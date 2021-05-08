package de.nickkel.addons.soundplayer;

import net.labymod.api.LabyModAddon;
import net.labymod.core.LabyModCore;
import net.labymod.gui.elements.Tabs;
import net.labymod.settings.elements.SettingsElement;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.network.play.server.S29PacketSoundEffect;

import java.util.List;

public class SoundPlayerAddon extends LabyModAddon {

    private static SoundPlayerAddon instance;

    @Override
    public void onEnable() {
        instance = this;
        Tabs.registerTab("Sounds", SoundOverviewGui.class);
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {

    }

    public void playSound(Sound sound, float volume, float pitch) {
        EntityPlayerSP player = LabyModCore.getMinecraft().getPlayer();
        playSound(sound.getKey(), player.posX, player.posY, player.posZ, volume, pitch);
    }

    private void playSound(String soundKey, double soundX, double soundY, double soundZ, float volume, float pitch) {
        S29PacketSoundEffect packetSoundEffect = new S29PacketSoundEffect(soundKey, soundX, soundY,
                soundZ, volume, pitch);
        LabyModCore.getMinecraft().getConnection().handleSoundEffect(packetSoundEffect);
    }

    public static SoundPlayerAddon getInstance() {
        return instance;
    }
}
