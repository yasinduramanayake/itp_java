package Model;

public class Payment {

	private double Amount;
	private String Email;
	private int PhoneNo;
	private String CrdName ;
	private int CrdNo;
	private String Ex_Date ;
	private int CVV;
	private int P_id;
	private String name;
	private int cus_id;
	
     
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the Amount
	 */
	public double getAmount() {
		return Amount;
	}
	/**
	 * @param Amount the Amount to set
	 */
	public void  setAmount(double Amount) {
		this.Amount = Amount;
	}
	
     
	/**
	 * @return the PhoneNo 
	 */
	public int getPhoneNo() {
		return  PhoneNo;
	}
	/**
	 * @param PhoneNo the  PhoneNo to set
	 */
	public void setPhoneNo(int  PhoneNo) {
		this. PhoneNo =  PhoneNo;
	}
	

	/**
	 * @return the  Email
	 */
	public String getEmail() {
		return  Email;
	}
	/**
	 * @param Email the  Email to set
	 */
	public void setEmail(String  Email) {
		this. Email =  Email;
	}
	
	/**
	 * @return the  CrdName
	 */
	public String getCrdName() {
		return  CrdName;
	}
	/**
	 * @param  the  CrdName to set
	 */
	public void setCrdName(String CrdName ) {
		this. CrdName = CrdName  ;
	}
	
	/**
	 * @return the  CrdNo
	 */
	public int getCrdNo() {
		return  CrdNo;
	}
	/**
	 * @param CrdNo the  CrdNo to set
	 */
	public void setCrdNo(int  CrdNo) {
		this. CrdNo =  CrdNo;
	}
	
	/**
	 * @return the  CVV
	 */
	public int getCVV() {
		return  CVV;
	}
	/**
	 * @param CVV the  CVV to set
	 */
	public void setCVV(int  CVV) {
		this. CVV =  CVV;
	}
	
	/**
	 * @return the Ex_Date 
	 */
	public String getEx_Date() {
		return  Ex_Date;
	}
	/**
	 * @param Ex_Date the  Ex_Date to set
	 */
	public void setEx_Date(String  Ex_Date) {
		this. Ex_Date =  Ex_Date;
	}
	
	/**
	 * @return the P_id
	 */
	public int getP_id() {
		return  P_id;
	}
	/**
	 * @param P_id the P_id to set
	 */
	public void setP_id(int P_id) {
		this. P_id =  P_id;
	}
	

}
