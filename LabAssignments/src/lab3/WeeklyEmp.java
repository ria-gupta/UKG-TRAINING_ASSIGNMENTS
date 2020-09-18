package lab3;

import java.math.BigDecimal;

public class WeeklyEmp extends Employee{
	
	public WeeklyEmp(int id,String name) {
		super(id,name);
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
		
		return this.getRate();
	}

	/*@Override
	public void setRate(BigDecimal rate) {
		super.setRate(getRate());
	}*/

}
