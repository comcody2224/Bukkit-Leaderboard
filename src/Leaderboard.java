
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.TimerTask;
import java.util.logging.Logger;
import org.bukkit.event.EventPriority;




public class Leaderboard extends JavaPlugin {
	//defines data map <Player, kills, deaths>
	public Map<Player, Integer > Leaderboard = new HashMap<Player, Integer>(); //Example syntax
	Logger log;
	//startup message
public   void onEnable(HashMap<Player, Integer>Info){ 
	Logger log = this.getLogger();
	log.info("Leaderboard has been initalized");}
	//Loads database
	@SuppressWarnings("unchecked")
	public HashMap<Player,Integer> Leaderboard1(HashMap<String, Integer> Leaderboard2) {
		try{
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(Leaderboard1));
			Object result = ois.readObject();
			//you can feel free to cast result to HashMap<Player,Boolean> if you know there's that HashMap in the file
			return (HashMap<Player,Integer>)result;
		}catch(Exception e){
			e.printStackTrace();
		}

	}



//shutdown message
public void onDisable(){ 
	 log.info("Leaderboard has been disabled.");
}
//player login event listener test
@EventHandler
public void onPlayerLogin(PlayerLoginEvent event) {
   log.info("login: event listner test");
}
//example command
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	if(cmd.getName().equalsIgnoreCase("basic")){ // If the player typed /basic then do the following...
		// doSomething
		return true;
	} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
	return false; 
}
//need to add event listener for kills and deaths

//player datamap
//need to write algorithm to sort out player levels

//save state

//timer
public long delay = 1000;
public long period = 1000;

public void schedule(TimerTask save, long delay , long period) { }
	
	// TODO Auto-generated method stub
	



	public void save(HashMap<Player,Integer> Leaderboard, String Leaderboard1)
		{
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(Leaderboard1));
			oos.writeObject(Leaderboard);
			oos.flush();
			oos.close();
			//Handle I/O exceptions
		}catch(Exception e){
			e.printStackTrace();
				}
			}
	}
		


//save system



//MySQL?
 


