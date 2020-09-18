package lab2.que5;

class Car extends Vehicle {
	private int noOfDoor;
	
	
	public Car(int noOfWheels, int noOfPassenger, int model, String make, int noOfDoor) {
		super(noOfWheels, noOfPassenger, model, make);
		this.noOfDoor = noOfDoor;
	}




	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}


	public void display()
	{
		System.out.println("MAKE :"+this.getMake());
		System.out.println("MODEL :"+this.getModel());
		System.out.println("NO OF DOORs :"+noOfDoor);
	}
	

}
