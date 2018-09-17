package Bean;
public class student{
	String name,email;
	
	public void setDetails(String n,String e){
		name=n;
		email=e;
	}
public String getName(){
		return name;
	}

	public String getEmail(){
		return email;
	}
}