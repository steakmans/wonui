package fr.steakmans.wonui.events;

import fr.steakmans.wonui.Main;
import fr.steakmans.wonui.client.ClientFuctions;
import fr.steakmans.wonui.ui.FactionScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvents {

    private static boolean openFactionScreen = false;

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent e) {
        if(ClientFuctions.openFactionMenu.isDown() || openFactionScreen) {
            Minecraft.getInstance().setScreen(new FactionScreen());
            openFactionScreen = false;
        }
    }

    @SubscribeEvent
    public static void onChatMessage(ClientChatEvent event) {
        if(event.getOriginalMessage().equalsIgnoreCase("/f menu")) {
            openFactionScreen = true;
        }
    }

}
