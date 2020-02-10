public class Birds extends Animal{
    double flySpeed ;

    public Birds() {
    }

    public Birds(int age, double weight, double flySpeed) {
        super(age, weight);
        this.flySpeed = flySpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void fly(){
        System.out.println("我去飞了...");
    }
}
