package animalKingdom;

public class Mammals extends AbstractAnimal {

    public Mammals(String name, int dYear) {
        super(name, dYear);

    }

    @Override
    public String getMove() {
        return "Walk";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Live Birth";
    }

    @Override
    public String getEat() {
        return "NOMNOMNOM";
    }
}