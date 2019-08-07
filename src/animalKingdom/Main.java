package animalKingdom;

import java.util.*;

public class Main {
    public static void printAnimals(ArrayList<AbstractAnimal> animals, CheckAnimal tester) {
        for (AbstractAnimal a : animals) {
            if (tester.test(a)) {
                System.out.println(a.name + " " + a.dYear);
            }
        }
    }

    private static void workWithData() 

    {

        // Make THE MAMS!
        Mammals panda = new Mammals("Panda", 1774);
        Mammals zebra = new Mammals("zebra", 1778);
        Mammals koala = new Mammals("koala", 1816);
        Mammals sloth = new Mammals("sloth", 1804);
        Mammals armadillo = new Mammals("armadillo", 1758);
        Mammals raccoon = new Mammals("raccoon", 1758);
        Mammals bigfoot = new Mammals("bigfoot", 2021);

        // BRING THE BIRDS
        Birds pigeon = new Birds("pigeon", 1837);
        Birds peacock = new Birds("peacock", 1821);
        Birds toucan = new Birds("toucan", 1758);
        Birds parrot = new Birds("parrit", 1824);
        Birds swan = new Birds("swan", 1758);

        // SEAFOOD
        Fish salmon = new Fish("salmon", 1758);
        Fish catfish = new Fish("catfish", 1817);
        Fish perch = new Fish("perch", 1758);

        //ARRAY LIST/////////////////////////////////////////////////////////////////////////////////////////

        ArrayList<AbstractAnimal> animalList = new ArrayList<AbstractAnimal>();

        //MAMS
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);

        //TWEETS
        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);

        //SEAFOOD
        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        
        //PRINTIN' TIME////////////////////////////////////////////////////////////////////


        System.out.println("DECENDING BY YEAR");
        animalList.sort((a1, a2) -> a1.dYear - a2.dYear);
        animalList.forEach((a) -> System.out.println(a.name));


        System.out.println("ALPHABATIZE ME CAPTAIN");
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        animalList.forEach((a) -> System.out.println(a.name));


        System.out.println("ALPHABETICALLY FROM 1758");
        printAnimals(animalList, a -> (a.dYear == 1758));


        System.out.println("MOVEMENT");
        printAnimals(animalList, a -> (a.getMove() == "Walk"));
        printAnimals(animalList, a -> (a.getMove() == "Fly"));
        printAnimals(animalList, a -> (a.getMove() == "Swim"));


        System.out.println("LUNGS");
        printAnimals(animalList, a -> (a.getBreath() == "Lungs"));

        System.out.println("LUNGS IN 1758");
        printAnimals(animalList, a -> (a.dYear == 1758) && (a.getBreath() == "Lungs"));

        System.out.println("LAY EGGS AND HAVE LUNGS");
        printAnimals(animalList, a -> (a.getReproduce() == "Eggs") && (a.getBreath() == "Lungs"));

    }

    public static void main(String[] args) {
        workWithData();
    }
}