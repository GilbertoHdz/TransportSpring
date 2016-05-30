package mx.manitos.from;

public class FromClass {
	
	private String orderID;
	private String shipName;
	private String customerCode;
	private String contactName;
	
	public FromClass(){
		
	}
	
	
	public FromClass(String orderID, String shipName, String customerCode, String contactName) {
		this.orderID = orderID;
		this.shipName = shipName;
		this.customerCode = customerCode;
		this.contactName = contactName;
	}


	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	
}
