package ro.andrei;

import ro.andrei.domain.CssTest;
import ro.andrei.domain.RestTest;
import ro.andrei.domain.TestingTemplate;

public class Main {

    public static void main(String[] args) {
        TestingTemplate css = new CssTest();
        TestingTemplate rest = new RestTest();
        css.test();
        rest.test();
    }
}
