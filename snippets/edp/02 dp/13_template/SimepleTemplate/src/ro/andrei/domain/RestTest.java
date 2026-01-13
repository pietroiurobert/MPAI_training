package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class RestTest extends TestingTemplate{
    @Override
    public void defineUnitTest() {
        System.out.println("defining rest flow");
    }

    @Override
    public void defineInputData() {
        System.out.println("defining request content");
    }

    @Override
    public void defineDesiredResults() {
        System.out.println("defining expected response");
    }

    @Override
    public void runTest() {
        System.out.println("making needed requests");
    }

    @Override
    public void showResults() {
        System.out.println("printing results");
    }
}
