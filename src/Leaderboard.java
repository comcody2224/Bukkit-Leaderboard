
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;
import org.bukkit.event.EventPriority;




public class Leaderboard extends JavaPlugin {
	Logger log;
public void onEnable(){ 
	Logger log = this.getLogger();
	log.info("Leaderboard has been initalized");
}
public void onDisable(){ 
	 log.info("Leaderboard has been disabled.");
}
@EventHandler
public void onPlayerLogin(PlayerLoginEvent event) {
   log.info(arg0,)
}
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	if(cmd.getName().equalsIgnoreCase("basic")){ // If the player typed /basic then do the following...
		// doSomething
		return true;
	} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
	return false; 
}

}

 


