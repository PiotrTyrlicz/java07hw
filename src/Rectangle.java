
public class Rectangle extends Shape{
    private double a;
    private double b;

    public void setA(double a) {
        this.a=a;
    }
    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b=b;
    }
    public double getB() {
        return b;
    }

    public Rectangle(double a, double b){
        this.a=a;
        this.b=b;
    }

}
