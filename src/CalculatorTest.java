
public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("Start programu");

        Rectangle rec= new Rectangle(3, 4);
        Circle circle= new Circle (1);

        System.out.println("Pole prostokąta: "+ShapeCalculator.rectangleArea(rec));
        System.out.println("Obwód prostokąta: "+ShapeCalculator.rectanglePerimeter(rec));
        System.out.println("Pole koła: "+ShapeCalculator.circleArea(circle));
        System.out.println("Obwód koła: "+ShapeCalculator.circlePerimeter(circle));

        Rectangle rec2= new Rectangle(5, 5);
        Rectangle rec3= new Rectangle(1, 2);
        Circle circle2= new Circle (2);

        Shape[] shape= new Shape[3];
        shape[0]= rec2;
        shape[1]= circle2;
        shape[2]= rec3;

        System.out.println("Pole prostokąta: "+ShapeCalculator.rectangleArea(rec2));
        System.out.println("Obwód prostokąta: "+ShapeCalculator.rectanglePerimeter(rec2));
        System.out.println("Pole koła: "+ShapeCalculator.circleArea(circle2));
        System.out.println("Obwód koła: "+ShapeCalculator.circlePerimeter(circle2));
        System.out.println("Pole prostokąta: "+ShapeCalculator.rectangleArea(rec3));
        System.out.println("Obwód prostokąta: "+ShapeCalculator.rectanglePerimeter(rec3));

    }
}