package ro.andrei.domain;

/**
 * Created by null on 11/4/16.
 */
public class CssTest extends TestingTemplate{
    @Override
    public void defineUnitTest() {
        System.out.println("defining test structure");
    }

    @Override
    public void defineInputData() {
        System.out.println("specifying input css");
    }

    @Override
    public void defineDesiredResults() {
        System.out.println("defining output image");
    }

    @Override
    public void runTest() {
        System.out.println("generating comparison image");
    }

    @Override
    public void showResults() {
        System.out.println("showing comparison mask");
    }
}
