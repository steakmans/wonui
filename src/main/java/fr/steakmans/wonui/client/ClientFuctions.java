package fr.steakmans.wonui.client;

import com.mojang.blaze3d.platform.InputConstants;
import fr.steakmans.wonui.ui.FactionScreen;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.DistExecutor;

public class ClientFuctions {
    public static KeyMapping openFactionMenu = new KeyMapping("key.wonui.faction", InputConstants.KEY_F1, KeyMapping.CATEGORY_MISC);

}
