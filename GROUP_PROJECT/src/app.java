import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		
		
		
		
	String q1 = "Question 1: Semiconductor memory device in which stored data will remain permanently stored as long as power is supplied is \n"+
			"A. dynamic memory device\r\n" + 
			"B. storage device\r\n" + 
			"C. flash device\r\n" + 
			"D. static memory device";
			
	String q2 = "Question 2: Computer word size is a multiple of \n"+
			"A. 16 bits\r\n" + 
			"B. 4 bits\r\n" + 
			"C. 1024 bits\r\n" + 
			"D. 10 bits";
	
	Question []	 questions = {
			new Question(q1, "a"),
			new Question(q2, "b")
			
	};
	
	initialize("text.tst");
	takeTest(questions);
	
	}

	//Function to write questions to file
	public static void initialize(String filename) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "rw");
			Question quiz = new Question();

			for (int idx = 1; idx <= 10; idx++) {
				file.seek((idx - 1) * quiz.sizeof());
				file.writeUTF(quiz.getPrompt());
				file.writeUTF(quiz.getAnswer());
			}

		} catch (IOException err) {
			System.err.println(err);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException err) {
					System.err.println(err);
				}
			}
		}
	}

	public static void takeTest(Question [] questions) {
		int score = 0;
		Scanner keyBoardInput = new Scanner(System.in);
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i].prompt);
			String answer = keyBoardInput.nextLine();
			if(answer.equals(questions[i].answer)) {
				score++;
			}
				
		}
		System.out.println("You got " + score + "/" + questions.length);
		
	}

}
