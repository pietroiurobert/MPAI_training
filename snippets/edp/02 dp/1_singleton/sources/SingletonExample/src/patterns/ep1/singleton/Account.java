package patterns.ep1.singleton;

public class Account {
	private Account(){}
	private static Account instance;
	private int ammount; 
	
	public static Account getInstance(){
		if (instance == null){
			instance = new Account();			
		}	
		return instance;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
}
