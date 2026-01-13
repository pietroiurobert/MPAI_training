/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package multiuserserver;

/**
 *
 * @author null
 */
public class Protocol {
    String processCommand(String request, String ip){
        String response = "unable to process";
        String[] items = request.split("\\s+");
        switch(items[0].trim()){
            case "name":
                UserData user = UserData.getInstance(ip);
                user.setUserName(items[1].trim());
                response = "user name changed";
                break;
            case "list":
                response = UserData.list();
                break;
            default:
                break;           
        }
        return response;
    }
}
