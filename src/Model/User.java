package Model;

public class User {
	
	public String firstName;
	public String lastname;
	public String email;
	public int phone;
	public String username;
	public String password;
	
	
	private static User singleton = new User( );
	
	private User() { }
	
	public static User getInstance( ) {
		 return singleton;
	}
	
	protected static void demoMethod( ) {
		      System.out.println("singleton method called");
	
	}
    
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getPhone() {
		return phone;
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
