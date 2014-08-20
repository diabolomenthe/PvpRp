package fr.yahoo.diabolomenthe75005.PvpRp;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import de.kumpelblase2.remoteentities.EntityManager;
import de.kumpelblase2.remoteentities.RemoteEntities;
import fr.yahoo.diabolomenthe75005.PvpRp.Command.CommandPnj;
import fr.yahoo.diabolomenthe75005.PvpRp.PNJ.PNJManager;




public class PvpRp extends JavaPlugin{
	//Fonction lors du lancement du serveur
		@Override
		public void onEnable(){
			//Cr�ation des managers
			EntityManager entitymanager = RemoteEntities.createManager(this);
			
			
			//Cr�ation des commandes
			CommandExecutor commandpnj = new CommandPnj(this,entitymanager);
			getCommand("pnj").setExecutor(commandpnj);

		}


		//Fonction lors de l'arr�t du serveur
		@Override
		public void onDisable(){

		}
}
