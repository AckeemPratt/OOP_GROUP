
public class Question {

	String prompt;
	String answer;
	
	protected long sizeof() {
		return ((50 * 2) + (50 * 2));
	}

	
	public Question() {
		setPrompt("default question");
		setAnswer("default answer");
	}
	
	
	public Question(String prompt, String answer) {
		this.prompt = prompt;
		this.answer = answer;
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
