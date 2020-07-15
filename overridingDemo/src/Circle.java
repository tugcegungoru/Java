public class Circle extends GeometricObject {
    private double radius;

    public Circle(){
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public Circle(double radius){
        this.radius = radius;
        //System.out.println("CircleFromSimpleGeometricObject");
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println("The circle is created "+ getDateCreated()+ " and the radius is "+ radius);
    }
}
