package patterns.ep1.multiton;

import java.util.HashMap;
import java.util.Map;

public class UserData {

	private static final Map<Object, UserData> instances = new HashMap<>();
	private String userName;
	private String password;

	private UserData() {
	}

	public static UserData getInstance(Object key) {
		UserData instance = instances.get(key);
		if (instance == null) {
			instance = new UserData();
			instance.userName = (String) key;
			instances.put(key, instance);
		}
		return instance;
	}

	public String toString() {
		return userName + " " + password;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
