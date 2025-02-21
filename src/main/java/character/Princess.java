package character;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Princess extends Character {
    private static final Logger logger = LogManager.getLogger(Princess.class);

    public Princess(String name) {
        super(name);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    public void cryForHelp() {
        logger.info("{} кричит: 'Помогите!'.", name);
    }

    public void thankHero() {
        logger.info("{} благодарит своего спасителя.", name);
    }
}