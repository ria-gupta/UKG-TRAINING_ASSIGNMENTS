package lab3;

import java.math.BigDecimal;

public class CommissionEmp extends Employee{
	
	private BigDecimal sales;
	
	public CommissionEmp(int id,String name,BigDecimal sales) {
		super(id,name);
		this.sales=sales;
	}
	
	

	@Override
	public void increaseSalary(BigDecimal increment) {
		// TODO Auto-generated method stub
		super.increaseSalary(increment);
	}



	@Override
	public String toString() {
		
		return super.toString();
	}



	@Override
	public BigDecimal getSalary() {
		BigDecimal commission=getRate();
		BigDecimal salary=sales.multiply(commission);
	    salary=salary.divide(new BigDecimal(100.00));
	    return salary;
	}

	/*@Override
	public void setRate(BigDecimal rate) {
		super.setRate(getRate());
	}*/

}
