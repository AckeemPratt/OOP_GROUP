
public class Questions {
		String prompt;
		String answer;
		/*private int qruesNo;
		private String question;
		private int choice1;
		private int choice2;
		private int choice3;
		private int answer;
		
		
		public Questions() {
			quesNo = 1;
			question = "Question";
			choice1 = 1; 
			choice2 = 2;
			choice3 = 3;
			answer = 1;
		}
		
		
	/*	public Questions(int quesNo, String question, int choice1, int choice2, int choice3, int answer) {
			//super();
			this.quesNo = quesNo;
			this.question = question;
			this.choice1 = choice1;
			this.choice2 = choice2;
			this.choice3 = choice3;
			this.answer = answer;
		}
		*/
		
	
		public Questions(String q2, String string) {
			// TODO Auto-generated constructor stub
		}


		public void Question(String prompt,String answer) {
			this.prompt=prompt;
			this.answer=answer;
			
		}
		
		
		
	/*	public int getQuesNo() {
			return quesNo;
		}


		public void setQuesNo(int quesNo) {
			this.quesNo = quesNo;
		}


		public String getQuestion() {
			return question;
		}


		public void setQuestion(String question) {
			this.question = question;
		}


		public int getChoice1() {
			return choice1;
		}


		public void setChoice1(int choice1) {
			this.choice1 = choice1;
		}


		public int getChoice2() {
			return choice2;
		}


		public void setChoice2(int choice2) {
			this.choice2 = choice2;
		}


		public int getChoice3() {
			return choice3;
		}


		public void setChoice3(int choice3) {
			this.choice3 = choice3;
		}


		public int getAnswer() {
			return answer;
		}


		public void setAnswer(int answer) {
			this.answer = answer;
		}


		public String toString() {
			String out;
			
			out=("Question Number  " + getQuesNo() + "\n");
			out+=("Question " + getQuestion() + "\n");
			out+=("Choice number " + getChoice1() + "\n");
			out+=("Choice number " + getChoice2() + "\n");
			out+=("Choice number " + getChoice3() + "\n");
			out+=("Answer number " + getAnswer() + "\n");
			return out;
		}
		
		


		
		/* public String toString() {
			return "Questions [quesNo=" + quesNo + ", question=" + question + ", choice1=" + choice1 + ", choice2="
					+ choice2 + ", choice3=" + choice3 + ", choice4=" + choice4 + ", choice5=" + choice5 + ", answer="
					+ answer + "]";
		}*/
		
		
		
		

}
