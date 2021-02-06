package Model;

public class Owner {
	 private  int UID;
	 private  String Name;
	 private  int Age;
	 private  String Email;
	 private  int contactNum;
	 private  String address;
	 private  String WorkingExperience;
	 private  String PASSWORD;
	 private  String retypePASSWORD;
	 
	 public  Owner() {
		super();
	}
	 public Owner(int UID,String Name, int Age,String Email,int contactNum,String address,String WorkingExperience,String PASSWORD,String retypePASSWORD) {
			super();
			this.UID = UID;
			this.Name = Name;
			this.Age = Age;
			this.Email = Email;
			this.contactNum = contactNum;
			this.address = address;
			this.WorkingExperience = WorkingExperience;
			this.PASSWORD = PASSWORD;
			this.retypePASSWORD = retypePASSWORD;
		
	 }
	 
	public  int getContactNum() {
		return contactNum;
	}



	public  void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}



	public  int getUID() {
		return UID;
	}
	public  void setUID(int uID) {
		UID = uID;
	}
	public  String getName() {
		return Name;
	}
	public  void setName(String name) {
		Name = name;
	}
	public  int getAge() {
		return Age;
	}
	public  void setAge(int age) {
		Age = age;
	}
	public  String getEmail() {
		return Email;
	}
	public  void setEmail(String email) {
		Email = email;
	}

	public  String getAddress() {
		return address;
	}
	public  void setAddress(String address) {
		this.address = address;
	}
	public  String getWorkingExperience() {
		return WorkingExperience;
	}
	public  void setWorkingExperience(String workingExperience) {
		WorkingExperience = workingExperience;
	}
	public  String getPASSWORD() {
		return PASSWORD;
	}
	public  void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public  String getRetypePASSWORD() {
		return retypePASSWORD;
	}
	public  void setRetypePASSWORD(String retypePASSWORD) {
		this.retypePASSWORD = retypePASSWORD;
	}
	 
	
}	 
	