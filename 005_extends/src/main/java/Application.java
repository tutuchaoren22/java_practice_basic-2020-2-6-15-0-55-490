public class Application {

    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {
        Animal rabbit = new Animal("兔子");
        Eagle eagle = new Eagle("老鹰", 4, 5, rabbit);

        System.out.print("一只" + eagle.getAge() + "的" + eagle.getName() + "，体重" + eagle.getWeight() + "，");
        System.out.println("这只" + eagle.getName() + "生活在" + rabbit.getName() + "窝所以它只捕食" + rabbit.getName() + "。");
        System.out.print("某天它先");
        eagle.fly();
        System.out.print("，在饥肠辘辘之际捕食了一只" + rabbit.getName() + "，然后");
        eagle.eat();
        System.out.println("，");
        System.out.print("心满意足之后就");
        eagle.sleep();
        System.out.print("。");
    }
}
