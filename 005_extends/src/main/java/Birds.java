public class Birds extends Animal {
    double flySpeed;

    public Birds() {
    }

    public Birds(String name, int age, int weight, double flySpeed) {
        super(name, age, weight);
        this.flySpeed = flySpeed;
    }

    public Birds(String name, int age, int weight) {
        super(name, age, weight);
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.print("翱翔天空");
    }
}
