public class Cat{
    public String name;
    private int age;
    private String color;

    //constructor-parametresiz
    public Cat(){
        name = "";
        age = 0;
        color = "";
    }

    //encapsulation

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    //constructor-parametreli-overloading
    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
