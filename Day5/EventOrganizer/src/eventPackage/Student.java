package eventPackage;

public class Student extends Person{
	// graduation year,course,fees,marks
	private int graduationYear;
	private String course;
	private double fees;
	private float marks;
	
	public Student(String firstName, String lastName, int graduationYear,
			String course, double fees, float marks) {
		super(firstName, lastName);
		this.graduationYear = graduationYear;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}

	public int getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	public void submitFeedback(String facultyName, String comment) {
		System.out.println("Student " + getFirstName() 
		+ " " + super.getLastName()
				+ " submitting feedback for the faculty " 
		+ facultyName + " comment " + comment);
	}
	
	@Override
	public String toString() {
		return super.toString()+"Student [graduationYear=" + graduationYear + ", course=" + course + ", fees=" + fees + ", marks="
				+ marks + "]";
	}
	
	

}
