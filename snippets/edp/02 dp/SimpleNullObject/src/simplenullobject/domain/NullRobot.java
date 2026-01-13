package simplenullobject.domain;

public class NullRobot extends AbstractRobot{

    @Override
    public void useAll() {
        System.out.println("placeholder robot cannot use devices");
    }
    
}
