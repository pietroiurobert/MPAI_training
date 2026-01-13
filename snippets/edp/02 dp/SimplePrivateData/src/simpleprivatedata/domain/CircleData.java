package simpleprivatedata.domain;

public class CircleData {

    private double radius;
    private Point origin;

    public CircleData(double radius, Point origin) {
        this.radius = radius;
        this.origin = origin;
    }

 
    public double getRadius() {
        return radius;
    }

    public Point getOrigin() {
        return origin;
    }

}
