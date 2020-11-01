public class Circle {

    private double radius;
    private String color;

    public Circle(double R, String C){
        radius = R;
        color = C;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(radius,2);

    }
}
