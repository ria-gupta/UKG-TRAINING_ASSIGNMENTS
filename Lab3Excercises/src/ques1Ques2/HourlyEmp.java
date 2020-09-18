package ques1Ques2;

import java.math.BigDecimal;

public class HourlyEmp extends Employee{
	private BigDecimal hours;

	public HourlyEmp(int id,String name,BigDecimal hours) {
		super(id,name);
		this.hours=hours;
		
	}
	
	
	

	@Override
	public void increaseSalary(BigDecimal increment) {
		// TODO Auto-generated method stub
		super.increaseSalary(increment);
	}




	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}




	@Override
	public BigDecimal getSalary() {
		BigDecimal hourRate=getRate();
		return hours.multiply(hourRate);
	}

	/*@Override
	public void setRate(BigDecimal rate) {
		super.setRate(getRate());
	}*/

}
