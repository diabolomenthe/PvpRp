package fr.yahoo.diabolomenthe75005.PvpRp.PNJ;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Wolf;
import org.bukkit.plugin.Plugin;

import de.kumpelblase2.remoteentities.EntityManager;

public class PNJManager {
	protected Plugin plugin;
	protected EntityManager npcregistry;
	
	public PNJManager (Plugin plugin,EntityManager npcregistry){
		this.plugin = plugin;
		this.npcregistry = npcregistry;
	}
	
	public void loadPNJManager(){
		
	}
	
	public boolean createPNJ(World world,Location location,String type){
		
		return false;
	}
	
	/*public PNJ selectPNJ(){
		return new PNJ();
	}*/
	
	public boolean removePNJ(){
		return false;
	}
	
}
