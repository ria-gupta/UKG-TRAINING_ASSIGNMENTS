package Que4;

public class Student {
	
	private String name,id;
	private double grade;
	
	public Student(String name,String id,double grade)
	{
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	public Student(String name,String id)
	{
		this(name,id,-1.0);
	}
	public Student(String id)
	{
		
		this("",id,-1.0);
	}
	public void display()
	{
		if(!name.equals(""))
			System.out.println("NAME : "+name);
		System.out.println("ID : "+id);
		if(grade!=-1.0)
			System.out.println("Grade : "+grade);
	}
	public void display(int year)
	{
		display();
		System.out.println("YEAR : "+year);
		
	}

}
