package fr.steakmans.wonui.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;

public class ModCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(Commands.literal("f").then(Commands.literal("menu").executes(ctx -> {
            /*if(ctx.getSource().getEntity() instanceof ServerPlayer) {
                ServerPlayer p = (ServerPlayer) ctx.getSource().getEntity();
                ModPackets.INSTANCE.sendTo(new OpenMenuPacket(), p.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
            }*/
            return 0;
        })));
    }

}
