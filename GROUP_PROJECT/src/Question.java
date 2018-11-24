
public class Question {

	int id;
	String prompt;
	String answer;
	
	protected long sizeof() {
		return (4+(50 * 2) + (50 * 2));
	}

	
	public Question() {
		setPrompt("default question");
		setAnswer("a");
	}
	
	
	public Question(int id,String prompt, String answer) {
		this.id = id;
		this.prompt = prompt;
		this.answer = answer;
	}

	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPrompt() {
		return prompt;
	}


	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
	
	
	
	
	
	
	
	
}
