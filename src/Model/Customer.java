package Model;

public class Customer {
private  int UID;
private  String Name;
private  String Address; 
private  int contactNum;
private  String NIC;
private  String Email;
private  String PASSWORD;
private  String retypePASSWORD;


public Customer() {
	super();
}
public Customer(int UID,String Name, String Address,int contactNum,String NIC,String Email,String PASSWORD,String retypePASSWORD) {
	super();
	this.UID=UID;
	this.Name=Name;
	this.Address=Address;
	this.contactNum=contactNum;
	this.NIC=NIC;
	this.Email=Email;
	this.PASSWORD=PASSWORD;
	this.retypePASSWORD=retypePASSWORD;
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

public  String getAddress() {
	return Address;
}
public  void setAddress(String address) {
	Address = address;
}
public  int getContactNum() {
	return contactNum;
}
public  void setContactNum(int contactNum) {
	this.contactNum = contactNum;
}

public  String getNIC() {
	return NIC;
}
public  void setNIC(String nIC) {
	NIC = nIC;
}
public  String getEmail() {
	return Email;
}
public  void setEmail(String email) {
	Email = email;
}
public String getPASSWORD() {
	return PASSWORD;
}
public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}
public  String getRetypePASSWORD() {
	return retypePASSWORD;
}
public void setRetypePASSWORD(String retypePASSWORD) {
	this.retypePASSWORD = retypePASSWORD;
}

}