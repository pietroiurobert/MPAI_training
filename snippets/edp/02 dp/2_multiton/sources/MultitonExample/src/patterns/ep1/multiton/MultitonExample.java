/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.ep1.multiton;

/**
 *
 * @author null
 */
public class MultitonExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserData firstUser = UserData.getInstance("user1");
        firstUser.setPassword("password1");
        UserData secondUser = UserData.getInstance("user2");
        secondUser.setPassword("password2");
        System.out.println(firstUser);
        System.out.println(secondUser);
        UserData thirdUser = UserData.getInstance("user2");
        thirdUser.setPassword("password3");
        System.out.println(secondUser);
    }

}
