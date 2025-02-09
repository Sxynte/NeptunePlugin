package me.craftxultra.neptuneplugin;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class NeptunePlugin extends SimplePlugin {

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		int apples = 1241241;

		System.out.println();
		System.out.println("[Neptune] Knock, Knock!");	//Prints: [Neptune] Knock, Knock!
	}

	/**
	 * Automatically perform login when the plugin starts and each time it is reloaded.
	 */
	@Override
	protected void onReloadablesStart() {

		// You can check for necessary plugins and disable loading if they are missing
		//Valid.checkBoolean(HookManager.isVaultLoaded(), "You need to install Vault so that we can work with packets, offline player data, prefixes and groups.");

		// Uncomment to load variables
		// Variable.loadVariables();

		//
		// Add your own plugin parts to load automatically here
		// Please see @AutoRegister for parts you do not have to register manually
		//
	}

	@Override
	protected void onPluginPreReload() {

		// Close your database here if you use one
		//YourDatabase.getInstance().close();
	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(final PlayerInteractEntityEvent event) {

		//makes a chicken burn on rightclick
		if (event.getRightClicked().getType() == EntityType.CHICKEN){
			event.getRightClicked().setFireTicks(20 * 60);
			event.getRightClicked().getWorld().spawnEntity(event.getRightClicked().getLocation(), EntityType.CHICKEN);
		}

		//makes a cow explode on rightclick
		if (event.getRightClicked().getType() == EntityType.COW){
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
		}
	}

	/* ------------------------------------------------------------------------------- */
	/* Static */
	/* ------------------------------------------------------------------------------- */

	/**
	 * Return the instance of this plugin, which simply refers to a static
	 * field already created for you in SimplePlugin but casts it to your
	 * specific plugin instance for your convenience.
	 *
	 * @return
	 */
	public static NeptunePlugin getInstance() {
		return (NeptunePlugin) SimplePlugin.getInstance();
	}

	int fN = 10;
	int sN = 10;

	int multiply(int fN, int sN){
		int result = fN * sN;
		return result;
	}

}
