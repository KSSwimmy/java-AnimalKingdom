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

        // MAKING THE MAMS!
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
        ArrayList<AbstractAnimal> mamList = new ArrayList<AbstractAnimal>();


        //MAMS
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);

        //NEW MAMS
        mamList.add(panda);
        mamList.add(zebra);
        mamList.add(koala);
        mamList.add(sloth);
        mamList.add(armadillo);
        mamList.add(raccoon);
        mamList.add(bigfoot);


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

        //List all the animals in descending order by year named
        System.out.println("DECENDING BY YEAR");
        animalList.sort((a1, a2) -> a1.dYear - a2.dYear);
        animalList.forEach((a) -> System.out.println(a.name));
        System.out.println();

        //List all the animals alphabetically
        System.out.println("ALPHABATIZE ME CAPTAIN");
        animalList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        animalList.forEach((a) -> System.out.println(a.name));
        System.out.println();

        //List alphabetically only those animals that were named in 1758
        System.out.println("ALPHABETICALLY FROM 1758");
        printAnimals(animalList, a -> (a.dYear == 1758));
        System.out.println();

        //List all the animals order by how they move
        System.out.println("MOVEMENT");
        printAnimals(animalList, a -> (a.getMove() == "Walk"));
        printAnimals(animalList, a -> (a.getMove() == "Fly"));
        printAnimals(animalList, a -> (a.getMove() == "Swim"));
        System.out.println();

        //List only those animals the breath with lungs
        System.out.println("LUNGS");
        printAnimals(animalList, a -> (a.getBreath() == "Lungs"));
        System.out.println();

        //List only those animals that breath with lungs and were named in 1758
        System.out.println("LUNGS IN 1758");
        printAnimals(animalList, a -> (a.dYear == 1758) && (a.getBreath() == "Lungs"));
        System.out.println();


        //List only those animals that lay eggs and breath with lungs
        System.out.println("LAY EGGS AND HAVE LUNGS");
        printAnimals(animalList, a -> (a.getReproduce() == "Eggs") && (a.getBreath() == "Lungs"));
        System.out.println();

        //STRETCH GOAL : For the list of animals, list alphabetically those animals that are mammals.
        System.out.println("MAMS LISTED ALPHABETICALLY");
        mamList.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
        mamList.forEach((a) -> System.out.println(a.name));


    }

    public static void main(String[] args) {
        workWithData();
    }
}


//PRINT OUT COMMANDS 


// Once in the src/ folder:
// Type javac employeeApp/*.java to compile all of the .java files
// Type jar cvfe EmpApp.jar employeeApp.Main employeeApp/*.class to compile all the .classfiles into a jar file
// Type java -jar EmpApp.jar to run the .jarfile you created

//IT PRINTS OUT

// DECENDING BY YEAR
// armadillo
// raccoon
// toucan
// swan
// salmon
// perch
// Panda
// zebra
// sloth
// koala
// catfish
// peacock
// parrit
// pigeon
// bigfoot

// ALPHABATIZE ME CAPTAIN
// armadillo
// bigfoot
// catfish
// koala
// Panda
// parrit
// peacock
// perch
// pigeon
// raccoon
// salmon
// sloth
// swan
// toucan
// zebra

// ALPHABETICALLY FROM 1758
// armadillo 1758
// perch 1758
// raccoon 1758
// salmon 1758
// swan 1758
// toucan 1758

// MOVEMENT
// armadillo 1758
// bigfoot 2021
// koala 1816
// Panda 1774
// raccoon 1758
// sloth 1804
// zebra 1778
// parrit 1824
// peacock 1821
// pigeon 1837
// swan 1758
// toucan 1758
// catfish 1817
// perch 1758
// salmon 1758

// LUNGS
// armadillo 1758
// bigfoot 2021
// koala 1816
// Panda 1774
// parrit 1824
// peacock 1821
// pigeon 1837
// raccoon 1758
// sloth 1804
// swan 1758
// toucan 1758
// zebra 1778

// LUNGS IN 1758
// armadillo 1758
// raccoon 1758
// swan 1758
// toucan 1758

// LAY EGGS AND HAVE LUNGS
// parrit 1824
// peacock 1821
// pigeon 1837
// swan 1758
// toucan 1758

// MAMS LISTED ALPHABETICALLY
// armadillo
// bigfoot
// koala
// Panda
// raccoon
// sloth
// zebra





