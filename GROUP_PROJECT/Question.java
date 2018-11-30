
public class Question {

	int id;
	String prompt;
	String answer;
	
	protected long sizeof() {
		return (4+(250 * 2) + (1 * 2));
	}

	
	public Question() {
		setId(0);
		setPrompt("default question");
		setAnswer("a");
	}
	
	
	public Question(int id,String prompt, String answer) {
		setId(id);
		setPrompt(prompt);
		setAnswer(answer);
	}
	
	public Question(Question question) {
		setId(question.getId());
		setPrompt(question.getPrompt());
		setAnswer(question.getAnswer());
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
	
	public String toString() {
		String out;
		out = "ID" + getId() + "\n";
		out+="Prompt" + getPrompt();
		out+="Answer" + getAnswer();
		
		return out;
		
	}	
}
