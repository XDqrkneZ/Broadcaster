package broadcast;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        Player p = (Player)sender;
        if(cmd.getName().equals("broadcast")){
                if(args.length == 0) {
                    p.sendMessage("§e/broadcast §7<message>");
                }else{
                        String msg = new String();
                        for (String arg : args) {
                                msg += arg + " ";
                        }
                        getServer().broadcastMessage(msg);
            }
        }

        return false;
    }
}
