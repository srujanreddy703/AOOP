package Login.com;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LoginSystem login_user1 = LoginSystem.getUser();
	        login_user1.login("Arjun");
	        //login_user1.logout();
	        LoginSystem user2 = LoginSystem.getUser();
	        user2.login("Sanju");
	}

}
