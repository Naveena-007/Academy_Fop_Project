package day04.solved;

public class User {


	String name;
	String email;
	String password;
	long phoneNo;

	public String getName(){
			return name;
	}

	public void setName(String newName){
			name = newName;
	}

		public String getEmail(){
			return email;
	}

	public void setEmail(String newEmail){
			email = newEmail;
	}

	public long getPhoneNo(){
			return phoneNo;
	}

	public void setPhoneNo(long newPhoneNo){
			phoneNo = newPhoneNo;
	}

	public String getPassword(){
    		return password;
	}

	public void setPassword(String newPassword){
			password = newPassword;
	}

	@Override
		public String toString() {
			String userDetails = "{ name: "+name+" email: "+email+" phoneNo: "+phoneNo+" }";
			System.out.println(userDetails);
			return userDetails;
		}
	
}
