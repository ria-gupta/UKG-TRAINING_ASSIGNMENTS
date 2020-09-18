package lab3;

import java.math.BigDecimal;

public class Invoice implements Payable {
	
	String partNum;
	String partDescription;
	int quantity;
	BigDecimal pricePerItem;
	
	
	public Invoice(String partNum, String partDescription, int quantity, BigDecimal pricePerItem) {
		super();
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Invoice [partNum=");
		builder.append(partNum);
		builder.append(", partDescription=");
		builder.append(partDescription);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", pricePerItem=");
		builder.append(pricePerItem);
		builder.append("]");
		return builder.toString();
	}


	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(BigDecimal pricePerItem) {
		this.pricePerItem = pricePerItem;
	}


	@Override
	public BigDecimal getPayment() {
		// TODO Auto-generated method stub
		
		return pricePerItem.multiply(new BigDecimal(quantity));
	}
	
	

}
