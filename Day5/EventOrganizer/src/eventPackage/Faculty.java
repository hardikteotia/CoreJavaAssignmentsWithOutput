package eventPackage;

public class Faculty extends Person{
	
	private int experienceInYears;
	private String speciality;
	
	public Faculty(String firstName, String lastName, int experienceInYears, String speciality) {
		super(firstName, lastName);
		this.experienceInYears = experienceInYears;
		this.speciality = speciality;
	}
	
	public int getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(int experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public String toString() {
		return super.toString()+"Faculty [experienceInYears=" + experienceInYears + ","
				+ "speciality=" + speciality + "]";
	}
	
	public void evaluateStudent(String studentName, String grade) {
		System.out.println("Faculty= "+getFirstName()+" "
				+getLastName()+" evaluating student "+studentName+
				" given the grade "+grade);
	}
	

	

}
