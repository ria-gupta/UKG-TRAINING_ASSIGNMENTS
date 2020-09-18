package lab2.que5;

class Vehicle {
	private int noOfWheels;
	private int noOfPassenger;
	private int model;
	String make;

	public int getNoOfWheels() {
		return noOfWheels;
	}
	public int getNoOfPassenger() {
		return noOfPassenger;
	}
	public int getModel() {
		return model;
	}
	public String getMake() {
		return make;
	}
	public Vehicle(int noOfWheels, int noOfPassenger, int model, String make) {
		this.noOfWheels = noOfWheels;
		this.noOfPassenger = noOfPassenger;
		this.model = model;
		this.make = make;
	}
	public void display()
	{
		System.out.println("MAKE :"+make);
		System.out.println("MODEL :"+model);
		System.out.println("NO OF WHEELS :"+noOfWheels);
		System.out.println("NO OF PASSENGERS :"+noOfPassenger);
	}

}
