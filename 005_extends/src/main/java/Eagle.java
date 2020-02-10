public class Eagle extends  Birds{
    Animal predator ;

    public Eagle() {
    }

    public Eagle(int age, double weight, double flySpeed, Animal predator) {
        super(age, weight, flySpeed);
        this.predator = predator;
    }

    public Animal getPredator() {
        return predator;
    }

    public void setPredator(Animal predator) {
        this.predator = predator;
    }
}
