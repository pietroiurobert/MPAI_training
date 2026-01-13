package multiuserserver;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author null
 */
public class ClientInfo {

    private ClientInfo() {
    }
    private static ClientInfo instance;
    private int userNo = 0;

    public static ClientInfo getInstance() {
        if (instance == null) {
            instance = new ClientInfo();
        }
        return instance;
    }
    
    public int getUserNo(){
        return userNo;
    }
    
    public void addUser() {
        this.userNo++;
    }

    public void removeUser() {
        this.userNo--;
    }
}
