public class Eagle extends Birds {
    Animal predator;

    public Eagle() {
    }


    public Eagle(String name, int age, int weight, double flySpeed, Animal predator) {
        super(name, age, weight, flySpeed);
        this.predator = predator;
    }

    public Eagle(String name, int age, int weight, Animal predator) {
        super(name, age, weight);
        this.predator = predator;
    }

    public Animal getPredator() {
        return predator;
    }

    public void setPredator(Animal predator) {
        this.predator = predator;
    }

}
