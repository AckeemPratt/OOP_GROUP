
public class StaffRec {

	private int idNumber;
	private String firstName;
	private String lastName;
	private String faculty;
	private String department;
	private Date dateEmployed;
	private String password;
	
	
	
	public StaffRec(int idNumber, String firstName, String lastName, String faculty, String department,
			Date dateEmployed, String password) {
		super();
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.faculty = faculty;
		this.department = department;
		this.dateEmployed = dateEmployed;
		this.password = password;
	}
	
	
	
	public int getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateEmployed() {
		return dateEmployed;
	}
	public void setDateEmployed(Date dateEmployed) {
		this.dateEmployed = dateEmployed;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	public String toString() {
		return "StaffRec [idNumber=" + idNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", faculty="
				+ faculty + ", department=" + department + ", dateEmployed=" + dateEmployed + ", password=" + password
				+ "]";
	}
}
	
		
	
