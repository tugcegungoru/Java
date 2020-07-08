public class Main {

    public static void main(String[] args) {

        //constructor-parametresiz
        Cat cat = new Cat();
        System.out.println(cat.name = "Fındık");
        cat.setColor("White");
        cat.setAge(5);
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());

        System.out.println("-------------");

        //constructor-parametreli
        Cat cat1 = new Cat("Şems",2,"Black");
        System.out.println(cat1.name);
        System.out.println(cat1.getAge());
        System.out.println(cat1.getColor());
    }
}
