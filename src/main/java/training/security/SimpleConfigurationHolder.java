package training.security;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleConfigurationHolder {

	private Boolean vault;

	private HashMap<String, String> properties = new HashMap<String, String>();
    private SimpleConfigurationKey key;
    
    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());

	protected void ConfigurationHolder() {

		if (!vault) {
		    LOGGER.warning("Vault is not inizialized! Vault properties will bel loaded from System Env...");
		}

		for (int i = 0; i < 5; i++) {

			String value = null;

			switch (key.store()) {
                case "sysprop":

                    LOGGER.warning("System Properties ["+key.extName()+"]");
                    break;

                case "vault":
                    LOGGER.warning("Vault value ["+key.extName()+"]["+System.getProperty(key.extName())+"]");
                    break;

                default:
                    LOGGER.warning("unknown store value " + key.store() + " for key " + key);
			}
			properties.put(key.name(), value);

		}

	}

}
