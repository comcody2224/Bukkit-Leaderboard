package net.beastnode.forge;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Commands implements CommandExecutor {
	 
	private Leaderboard plugin;
 
	public Commands(Leaderboard plugin) {
		this.plugin = plugin;
	}
 
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(cmd.getName().equalsIgnoreCase("lead")){ // If the player typed /basic then do the following...
			// doSomething
			return true;
		} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
		return false;
	}
}