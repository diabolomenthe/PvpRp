package fr.yahoo.diabolomenthe75005.PvpRp.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class CommandPnj implements CommandExecutor{
	protected Plugin plugin = null;

	public CommandPnj(Plugin plugin){
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command,
			String label, String[] args) {
		if(checkSyntax(sender,args)){
			return false;
		}
		Player player = (Player) sender;
		
		player.sendMessage("Commande PNJ");
		return true;
	}

	private boolean checkSyntax(CommandSender sender,String args[]){
		if(sender instanceof Player){
			Player player = (Player) sender;

			//vérifie existence de l'argument 0
			if(args[0].length() != 0){
				boolean test = false;
				//Liste des commandes possibles
				switch (args[0]) {
				case "create":
					test = checkCreate(player,args);
					break;
				case "remove":
					test = checkRemove(player,args);
					break;
				default :
					test = false;
				}
				if(!test){
					player.sendMessage("Erreur de syntaxe");
					return false;
				}
			} else {
				player.sendMessage("Erreur de syntaxe");
				return false;
			}
		} else {
			sender.sendMessage("Cette commande doit être lancée par un joueur");
			return false;
		}
		return true;
	}

	private boolean checkRemove(Player player, String[] args) {
		if(args[1].length() == 0){
			player.sendMessage("Erreur de syntaxe");
			return false;
		}
		return false;
	}
	private boolean checkCreate(Player player, String[] args) {
		if(args[1].length() == 0){
			player.sendMessage("Erreur de syntaxe");
			return false;
		}
		if(args[2].length() == 0){
			player.sendMessage("Erreur de syntaxe");
			return false;
		}
		return true;
	}

}
