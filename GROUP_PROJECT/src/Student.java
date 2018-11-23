import java.util.*;

public class Student {

	public int idNumber;
	public String firstName;
	public String lastName;
	public String address;
	public Date dateEnrolled;
	public String contactNumber;
	public ProgrammeRec programme ;
	public CourseRec course;
	
	public Student() {
		idNumber = 0;
		firstName = "first name";
		lastName = "last name";
		address = "address";
		dateEnrolled = new Date();
		contactNumber = "contact number";
		programme = new ProgrammeRec();
		course = new CourseRec();
	
	public Student(int idNumber, String firstName, String lastName, String address, Date dateEnrolled,
		String contactNumber, ProgrammeRec programme, CourseRec course){
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.dateEnrolled = dateEnrolled;
		this.contactNumber = contactNumber;
		this.programme = programme;
		this.course = course;
	}
		
	public Student(Student stud){
		idNumber = stud.idNumber;
		firstName = stud.firstName;
		lastName = stud.lastName;
		address = stud.address;
		dateEnrolled = stud.dateEnrolled;
		contactNumber = stud.contactNumber;
		programme = stud.programme;
		course = stud.course;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public ProgrammeRec getProgramme() {
		return programme;
	}

	public void setProgramme(ProgrammeRec programme) {
		this.programme = programme;
	}

	public CourseRec getCourse() {
		return course;
	}

	public void setCourse(CourseRec course) {
		this.course = course;
	}
	
	
	//display method
	public String toString() {
		String out;
		out=("ID number is " + getIdNumber() + "\n");
		out+=("First Name is " + getFirstName() + "\n");
		out+=("Last Name is " + getLastName() + "\n");
		out+=("Address is " + getAddress() + "\n");
		out+=("Date enrolled is " + getDateEnrolled() + "\n");
		out+=("Contact Number is " + getContactNumber() + "\n");
		out+=("Programme is " + getProgramme() + "\n");
		out+=("Course is " + getCourse() + "\n");
		return out;
	}
		
	/*public static void SetTaketest() {
	
	Question[] question= {
			new Question(q1 ,"a");
			new Question(q2 ,"a");
			}
	}
		
	
	public void menu(){
		int choice=0;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println("Please Select Option below ");
			System.out.println("1. Take Test");
			System.out.println("2. View test Result");
			System.out.println("3. Exit");
			
			switch(input.nextInt()) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			default:
				
				break;
				
			}
			
		}while(input.nextInt() !=3);
	}*/
			
	}




