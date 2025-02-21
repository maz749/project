package scenario;

import character.*;
import exception.EmptyCollectionException;
import item.Food;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    private static final Logger logger = LogManager.getLogger(Scenario.class);

    public static void main(String[] args) {
        try {
            logger.info("Сказка начинается...");

            // Создание списка персонажей
            List<character.Character> characters = new ArrayList<>();
            Prince prince = new Prince("Принц");
            Servant servant = new Servant("Слуга");
            King king = new King("Король");
            Wizard wizard = new Wizard("Волшебник");
            Dragon dragon = new Dragon("Злой Дракон");
            Princess princess = new Princess("Принцесса");

            characters.add(prince);
            characters.add(servant);
            characters.add(king);
            characters.add(wizard);
            characters.add(dragon);
            characters.add(princess);

            // Проверка на пустой список
            if (characters.isEmpty()) {
                logger.error("Список персонажей пуст.");
                throw new EmptyCollectionException("Список персонажей пуст.");
            }

            // Король думает о государственных делах
            king.think("Как улучшить королевство?");
            logger.debug("Король подумал о государственных делах.");

            // Принц играет в мяч
            logger.info("Принц играет в мяч.");
            prince.expressEmotion("счастливым");

            // Принц устает и решает отдохнуть
            prince.rest();
            logger.debug("Принц решил отдохнуть.");

            // Слуга наблюдает за Принцем
            servant.observe(prince);
            logger.debug("Слуга наблюдает за Принцем.");

            // Слуга приносит еду
            Food apple = new Food("яблоко");
            servant.feed(prince, apple);
            logger.info("Слуга принес еду Принцу.");

            // Принц выражает эмоции
            prince.expressEmotion("сытым и довольным");
            logger.debug("Принц выразил эмоции.");

            // Король разговаривает с Принцем
            king.talk(prince);
            logger.info("Король поговорил с Принцем.");

            // Принц решает отправиться на прогулку
            prince.move("сад");
            logger.info("Принц отправился на прогулку.");

            // Встреча с Волшебником
            wizard.giveAdvice("В заколдованном лесу находится Злой Дракон, который похитил Принцессу.");
            logger.info("Волшебник рассказывает о заколдованном лесе.");

            // Принц отправляется в лес
            prince.move("заколдованный лес");
            logger.info("Принц отправляется в заколдованный лес.");

            // Встреча с Драконом
            dragon.guard();
            logger.info("Принц встречает Злого Дракона.");

            // Битва с Драконом
            dragon.breatheFire();
            logger.info("Дракон извергает пламя!");
            prince.expressEmotion("испуганным");

            // Волшебник помогает Принцу
            wizard.castSpell("Огненный щит");
            logger.info("Волшебник защищает Принца от пламени.");

            // Принц побеждает Дракона
            logger.info("Принц побеждает Дракона!");
            dragon.expressEmotion("поверженным");

            // Спасение Принцессы
            princess.cryForHelp();
            logger.info("Принцесса зовет на помощь.");
            prince.move("логовище Дракона");
            logger.info("Принц находит Принцессу.");

            // Принцесса благодарит Принца
            princess.thankHero();
            logger.info("Принцесса благодарит Принца.");

            // Возвращение домой
            prince.move("королевство");
            logger.info("Принц и Принцесса возвращаются домой.");

            // Логирование успешного завершения сценария
            logger.info("Сказка завершена. Все счастливы!");
        } catch (EmptyCollectionException e) {
            logger.error("Ошибка: " + e.getMessage(), e);
        } catch (Exception e) {
            logger.error("Неизвестная ошибка: " + e.getMessage(), e);
        }
    }
}