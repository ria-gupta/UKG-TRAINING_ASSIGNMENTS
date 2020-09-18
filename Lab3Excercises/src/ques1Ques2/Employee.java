package ques1Ques2;

import java.math.BigDecimal;

public abstract class Employee implements Payable {
	

	private BigDecimal rate;
	private int id;
	private String name;
	
	public void increaseSalary(BigDecimal increment)
	{
		this.rate=this.rate.add(increment);
	}
	
	

	@Override
	public BigDecimal getPayment() {
		
		return getSalary();
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [rate=");
		builder.append(rate);
		builder.append(", id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}

	public Employee(int id, String name) {
		// this.rate=rate;
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	abstract BigDecimal getSalary();

}
