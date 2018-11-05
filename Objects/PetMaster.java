package Objects;

import Others.Fish;
import Others.Pet;

public class PetMaster {

    public static void main(String[] args) {
        String petReaction;
        Pet pet = new Pet();
        pet.eat();
        petReaction = pet.say("Чик!Чирик!");
        System.out.println(petReaction);
        pet.sleep();

        Fish fish = new Fish();
        fish.dive();
        fish.sleep();
    }
}
