package builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<GameCharacter> gameCharacterList = new ArrayList<>();
        GameCharacter.GameCharacterBuilder builder = new GameCharacter.GameCharacterBuilder();

        GameCharacter gameCharacter1 = builder
                .setName("Jan")
                .setHealth(100)
                .setMana(20)
                .setNumberOfPoints(20)
                .createGameCharacter();

        GameCharacter gameCharacter2 = builder
                .setName("Jan")
                .setHealth(100)
                .setMana(20)
                .setNumberOfPoints(20)
                .createGameCharacter();

        GameCharacter gameCharacter3 = builder
                .setName("Jan")
                .setHealth(100)
                .setMana(20)
                .setNumberOfPoints(20)
                .createGameCharacter();

        GameCharacter gameCharacter4 = builder
                .setName("Jan")
                .setHealth(100)
                .setMana(2)
                .setNumberOfPoints(20)
                .createGameCharacter();

        GameCharacter gameCharacter5 = builder
                .setName("Marek")
                .setHealth(100)
                .setMana(10)
                .setNumberOfPoints(20)
                .createGameCharacter();

        GameCharacter gameCharacter6 = builder
                .setName("Paweł")
                .setHealth(100)
                .setMana(20)
                .setNumberOfPoints(5)
                .createGameCharacter();


        {

        }
        gameCharacterList.add(gameCharacter1);
        gameCharacterList.add(gameCharacter2);
        gameCharacterList.add(gameCharacter3);
        gameCharacterList.add(gameCharacter4);
        gameCharacterList.add(gameCharacter5);
        gameCharacterList.add(gameCharacter6);

        System.out.println(gameCharacterList);


    }
}
