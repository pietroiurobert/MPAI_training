package ro.andrei.domain;

public abstract class TestingTemplate {

    public abstract void defineUnitTest();
    public abstract void defineInputData();
    public abstract void defineDesiredResults();
    public abstract void runTest();
    public abstract void showResults();

    public void test(){
        defineUnitTest();
        defineInputData();
        defineDesiredResults();
        runTest();
        showResults();
    }
}
