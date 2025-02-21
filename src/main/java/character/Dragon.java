package character;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dragon extends Character {
    private static final Logger logger = LogManager.getLogger(Dragon.class);

    public Dragon(String name) {
        super(name);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    public void breatheFire() {
        logger.info("{} извергает пламя!", name);
    }

    public void guard() {
        logger.info("{} охраняет свою добычу.", name);
    }

    public void expressEmotion(String поверженным) {
    }
}