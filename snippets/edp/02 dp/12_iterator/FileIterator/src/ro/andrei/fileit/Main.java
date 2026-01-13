package ro.andrei.fileit;

import ro.andrei.fileit.util.FileUtil;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        try (FileUtil util = new FileUtil("somefile")) {
            for (String s:util) {
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
