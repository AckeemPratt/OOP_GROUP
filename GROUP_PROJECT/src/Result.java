
public class Result {

	int id;
	String firstName;
	String lastName;
	String test;
	int score;
	
	
	
	protected long sizeof() {
		return (4+(50 * 2) + (50 * 2)+4);
	}

	
	public Result() {
		setId(0);
		setFirstName("first name");
		setLastName("last name");
		setTest("Test");
		setScore(0);
	}
	
	
	public Result(int id,String firstName, String lastName, String Test, int score) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setTest(Test);
		setScore(score);
	}
	
	public Result(Result obj) {
		setId(obj.getId());
		setFirstName(obj.getFirstName());
		setLastName(obj.getLastName());
		setTest(obj.getTest());
		setScore(obj.getScore());
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getTest() {
		return test;
	}


	public void setTest(String test) {
		this.test = test;
	}
	
	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		String out;
		out = "ID" + getId() + "\n";
		out+="First Name" + getFirstName();
		out+="Last Name" + getLastName();
		out+="Test " + getTest();
		out+="Score" + getScore();
		return out;
		
	}	
}
