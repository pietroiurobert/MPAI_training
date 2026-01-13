package simpleprivatedata;

import simpleprivatedata.domain.Circle;
import simpleprivatedata.domain.Point;

public class SimplePrivateData {

    public static void main(String[] args) {
        Circle c = new Circle(10.0, new Point(1.0,1.0));
        System.out.println(c.getCircumference());
        c.draw();
    }
    
}
