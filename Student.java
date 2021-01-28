
public class Student {
	private int roll;
	
	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	private String name;
	private String courseName;
	private int marks;
	
	Student(int roll,String name,String courseName,int marks)
	{
		this.roll = roll;
		this.name=name;
		this.courseName=courseName;
		this.marks=marks;
	}
	
	public void print()
	{
		System.out.println("RollNo = "+this.roll);
		System.out.println("name = "+this.name);
		System.out.println("CourseName  = "+this.courseName);
		System.out.println("marks = "+this.marks);

	}

}