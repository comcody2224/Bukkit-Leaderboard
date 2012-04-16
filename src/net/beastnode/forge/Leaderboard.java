package net.beastnode.forge;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import lib.PatPeter.SQLibrary.*;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

class Leaderboard extends JavaPlugin implements Listener{
	public Map<PlayerName, String> lead = new HashMap<PlayerName, String>();
	
	Logger log = this.getLogger();
	private Commands myExecutor;
	@Override
	public void onEnable(){ 
		
		getServer().getPluginManager().registerEvents(new Leaderboard(), this);
		myExecutor = new Commands(this);
		getCommand("lead").setExecutor(myExecutor);
		log.info("Leaderboard is now initialized");
	 
}

public void onDisable(){ 
	log.info("Leaderboard is now disabled");


}

@EventHandler
public void onPlayerDeath(PlayerDeathEvent event, final Player name) {
    
}

 
@EventHandler
public void normalLogin(PlayerLoginEvent event, final Player name) {
	if(lead.containsKey(player)){
   
}	
 

}


	

