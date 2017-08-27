package NetCaps;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NetCaps
  extends JavaPlugin
  implements Listener
{
  @Override
public void onEnable()
  {
	  getServer().getPluginManager().registerEvents(this, this);
  }
  @EventHandler
  public void onPlayerChat(AsyncPlayerChatEvent event)
  {
    String message = event.getMessage();
    {
      event.setMessage(message.toLowerCase().replaceAll(message, null));
      event.getPlayer().sendMessage(ChatColor.BLUE + "CapsLock OFF");
    }
    event.setCancelled(false);
  }
}