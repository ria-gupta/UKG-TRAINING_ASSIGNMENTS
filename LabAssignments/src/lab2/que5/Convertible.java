package lab2.que5;

class Convertible extends Car {
	
	private boolean isHoodOpen;

	public Convertible(int noOfWheels, int noOfPassenger, int model, String make, int noOfDoor, boolean isHoodOpen) {
		super(noOfWheels, noOfPassenger, model, make, noOfDoor);
		this.isHoodOpen = isHoodOpen;
	}
	
	public void display()
	{
		super.display();
		
		System.out.println("IS HOOD OPEN?:"+isHoodOpen);
	}
	

}
