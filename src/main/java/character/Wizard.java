package character;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Wizard extends Character {
    private static final Logger logger = LogManager.getLogger(Wizard.class);

    public Wizard(String name) {
        super(name);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    public void castSpell(String spell) {
        logger.info("{} произносит заклинание: '{}'.", name, spell);
    }

    public void giveAdvice(String advice) {
        logger.info("{} дает совет: '{}'.", name, advice);
    }
}