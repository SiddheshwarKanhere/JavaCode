package userEx;

public class User {
	
	int id;
	String name;
	
	public User() {
		
	}
	
	public User(int id, String name) {
		
		this.id=id;
		this.name=name;
	}
	
	public void speak() {
		System.out.println("Hi, I am : " + name);
	}

}
