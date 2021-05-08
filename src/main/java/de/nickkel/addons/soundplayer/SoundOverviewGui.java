package de.nickkel.addons.soundplayer;

import com.google.common.collect.Lists;
import net.labymod.gui.elements.ModTextField;
import net.labymod.gui.elements.Scrollbar;
import net.labymod.gui.elements.Tabs;
import net.labymod.main.LabyMod;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;
import java.util.List;

public class SoundOverviewGui extends GuiScreen {

    private final Scrollbar scrollbar = new Scrollbar(25);
    private ModTextField fieldVolume, fieldPitch;
    private String storedVolume, storedPitch;
    private final List<GuiButton> soundButtons = Lists.newArrayList();
    private double lastScrollY;

    @Override
    public void initGui() {
        super.initGui();
        this.soundButtons.clear();

        if (LabyMod.getInstance().isInGame()) {
            this.scrollbar.init();
            this.scrollbar.setPosition(this.width / 2 + 122, 44, this.width / 2 + 126,
                    this.height - 32 - 3);
            this.scrollbar.setSpeed(30);

            this.fieldVolume = new ModTextField(-1, LabyMod.getInstance().getDrawUtils().fontRenderer, 27, 90, 25, 20);
            this.fieldVolume.setMaxStringLength(4);
            this.fieldVolume.setText("1.0");
            this.storedVolume = "1.0";

            this.fieldPitch = new ModTextField(-1, LabyMod.getInstance().getDrawUtils().fontRenderer, 27, 143, 25, 20);
            this.fieldPitch.setMaxStringLength(4);
            this.fieldPitch.setText("1.0");
            this.storedPitch = "1.0";

            int buttonLength = 200;
            int buttonHeight = 20;
            int lastY = 5;
            for (int i = 0; i < Sound.values().length; i++) {
                Sound sound = Sound.values()[i];
                lastY += buttonHeight + 5;
                this.soundButtons.add(new GuiButton(10000 + i, this.width / 2 - buttonLength / 2, lastY, buttonLength, buttonHeight, sound.name()));
            }

            this.buttonList.addAll(this.soundButtons);
        }

        Tabs.initGuiScreen(this.buttonList, this);
    }

    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        LabyMod.getInstance().getDrawUtils().drawAutoDimmedBackground(this.scrollbar.getScrollY());

        if (LabyMod.getInstance().isInGame()) {
            if (this.lastScrollY != this.scrollbar.getScrollY()) {
                double scrollDifference = this.scrollbar.getScrollY() - this.lastScrollY;
                this.lastScrollY = this.scrollbar.getScrollY();
                for (GuiButton guiButton : this.soundButtons) {
                    guiButton.yPosition += scrollDifference;
                }
            }

            this.scrollbar.update(Sound.values().length);
            this.scrollbar.draw();

            LabyMod.getInstance().getDrawUtils().drawString("Volume", 27, 76);
            this.fieldVolume.drawTextBox();

            LabyMod.getInstance().getDrawUtils().drawString("Pitch", 27, 129);
            this.fieldPitch.drawTextBox();
        } else {
            LabyMod.getInstance().getDrawUtils().drawCenteredString("§cPlease join a world or a server to use the SoundPlayer addon", this.width / 2, 100);
        }

        super.drawScreen(mouseX, mouseY, partialTicks);
    }

    protected void actionPerformed(GuiButton button) throws IOException {
        super.actionPerformed(button);
        Tabs.actionPerformedButton(button);
        if (this.soundButtons.contains(button)) {
            try {
                SoundPlayerAddon.getInstance().playSound(Sound.valueOf(button.displayString), Float.parseFloat(this.storedVolume), Float.parseFloat(this.storedPitch));
            } catch (Exception e) {
                SoundPlayerAddon.getInstance().playSound(Sound.valueOf(button.displayString), 1.0F, 1.0F);
            }
        }
    }

    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        if (this.fieldVolume.textboxKeyTyped(typedChar, keyCode)) {
            this.storedVolume = this.fieldVolume.getText();
        }
        if (this.fieldPitch.textboxKeyTyped(typedChar, keyCode)) {
            this.storedPitch = this.fieldPitch.getText();
        }
        super.keyTyped(typedChar, keyCode);
    }

    @Override
    public void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
        if (LabyMod.getInstance().isInGame()) {
            this.scrollbar.mouseAction(mouseX, mouseY, Scrollbar.EnumMouseAction.CLICKED);
            this.fieldVolume.mouseClicked(mouseX, mouseY, mouseButton);
            this.fieldPitch.mouseClicked(mouseX, mouseY, mouseButton);
        }
    }

    @Override
    public void mouseClickMove(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {
        super.mouseClickMove(mouseX, mouseY, clickedMouseButton, timeSinceLastClick);
        this.scrollbar.mouseAction(mouseX, mouseY, Scrollbar.EnumMouseAction.DRAGGING);
    }

    @Override
    public void mouseReleased(int mouseX, int mouseY, int state) {
        super.mouseReleased(mouseX, mouseY, state);
        this.scrollbar.mouseAction(mouseX, mouseY, Scrollbar.EnumMouseAction.RELEASED);
    }

    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.scrollbar.mouseInput();
    }
}