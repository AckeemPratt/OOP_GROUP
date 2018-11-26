public class Login {
	private int id;
	private String password;
	
	//default
	public Login() {
		id = 0;
		password = "password";
	}
	
	//primary
	public Login(int id, String password) {
		this.id = id;
		this.password = password;
	}
	
	//copy
	public Login(Login obj) {
		id = obj.id;
		password = obj.password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public long sizeof() {
		return (4 + (20 * 2));
	}
//will not use override
	/*@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + "]";
	}*/
	
	
}