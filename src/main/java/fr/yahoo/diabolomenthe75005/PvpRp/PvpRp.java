package fr.yahoo.diabolomenthe75005.PvpRp;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import fr.yahoo.diabolomenthe75005.PvpRp.Command.CommandPnj;




public class PvpRp extends JavaPlugin{
	//Fonction lors du lancement du serveur
		@Override
		public void onEnable(){
			//Cr�ation des commandes
			CommandExecutor commandpnj = new CommandPnj(this);
			getCommand("pnj").setExecutor(commandpnj);

		}


		//Fonction lors de l'arr�t du serveur
		@Override
		public void onDisable(){

		}
}
