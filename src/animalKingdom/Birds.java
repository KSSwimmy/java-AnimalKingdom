package animalKingdom;

public class Birds extends AbstractAnimal {

    public Birds(String name, int dYear) {
        super(name, dYear);

    }

    @Override
    public String getMove() {
        return "Fly";
    }

    @Override
    public String getBreath() {
        return "Lungs";
    }

    @Override
    public String getReproduce() {
        return "Eggs";
    }

    @Override
    public String getEat() {
        return "NOMNOMNOM";
    }
}