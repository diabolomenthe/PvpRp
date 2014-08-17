package fr.yahoo.diabolomenthe75005.PvpRp.PNJ;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;

public class PNJManager {
	protected Plugin plugin;

	public PNJManager (Plugin plugin){
		this.plugin = plugin;
	}
	
	public void loadPNJManager(){
		
	}
	
	public boolean createPNJ(World world,Location location){
		Entity entity = world.spawnEntity(location, org.bukkit.entity.EntityType.valueOf("PIG"));
		UUID uuid = entity.getUniqueId();
		EntityType entitytype = entity.getType();
		return false;
	}
	
	public PNJ selectPNJ(){
		return new PNJ();
	}
	
	public boolean removePNJ(){
		return false;
	}
	
}
