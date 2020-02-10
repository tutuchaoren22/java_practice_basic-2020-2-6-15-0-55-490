public class Animal {
    int age;
    double weight;

    public Animal() {
    }

    public Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("我去吃东西了...");
    }

    public void sleep() {
        System.out.println("我去睡觉了...");
    }
}
