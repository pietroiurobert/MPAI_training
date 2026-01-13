package multiuserserver;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	private static final Map<Object, UserData> instances = new HashMap<>();
	private String userName;

	private UserData() {
	}

	public static synchronized UserData getInstance(Object key) {
		UserData instance = instances.get(key);
		if (instance == null) {
			instance = new UserData();
			instance.setUserName((String) key);
			instances.put(key, instance);
		}
		return instance;
	}

	public static String list() {
            String result="";
            for (Map.Entry<Object, UserData> entry : instances.entrySet()) {
                Object object = entry.getKey();
                UserData userData = entry.getValue();
                result+=object+" "+userData.getUserName()+"|";
                
            }
            return result;
	}

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the ip
     */
    
	

}
