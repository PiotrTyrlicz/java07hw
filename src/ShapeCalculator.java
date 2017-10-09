
public class ShapeCalculator {

    static double rectangleArea(Rectangle rec) {
        double wynik=rec.getA()*rec.getB();
        return wynik;
    }
    static double rectanglePerimeter(Rectangle rec) {
        double wynik=2*rec.getA()+2*rec.getB();
        return wynik;
    }


    static double circleArea(Circle circle) {
        double wynik=Math.PI*Math.pow(circle.getR(), 2);
        return wynik;
    }

    static double circlePerimeter(Circle circle) {
        double wynik=Math.PI*2*circle.getR();
        return wynik;
    }


}
