package week1.day1;

public class Mobile {
	String mobilemodle= "Iphone12";
	int mobileweight= 12;
	Boolean isFullcharge= true;
	Double mobilecost= 12000.0;
	
	
	public void makecall() {
		System.out.println("Make call to user");
		System.out.println("Mobile name : " + mobilemodle);
		System.out.println("Mobile weight : " +mobileweight);
		System.out.println("Mobile charge ? : " + isFullcharge);
		System.out.println("Mobile cost : " + mobilecost);
	}

	public void sendMsg() {
		System.out.println("Send message to user");
	}
	
	public static void main(String[] args) {
		Mobile object = new Mobile();
		object.makecall();
		object.sendMsg();
	}
}
