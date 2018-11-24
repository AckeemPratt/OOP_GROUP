import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class app {

	//Function to write questions to file
	public static void initialize(String filename) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "rw");
			Question quiz = new Question();

			for (int idx = 1; idx <= 10; idx++) {
				file.seek((idx - 1) * quiz.sizeof());
				file.writeInt(quiz.getId());
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

	public static void writeRecord(Question quiz) {
		RandomAccessFile file = null;
		String filename = "test.dat";
		try {
			file = new RandomAccessFile(filename, "rw");

			file.seek((quiz.getId() - 1) * quiz.sizeof());
			file.writeInt(quiz.getId());
			file.writeUTF(quiz.getPrompt());
			file.writeUTF(quiz.getAnswer());
			
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
	
	public static int takeTest(String filename) {
		int score = 0;
		
		RandomAccessFile file = null;
		
		try {
			file = new RandomAccessFile(filename, "rw");
			
			Question[] quiz = new Question[10];
			
			for(int i = 1; i <= 10; i++ ) {
				
			file.seek((i-1) * (4+(2*50)+(2*50)));
			int id = file.readInt();
			String prompt = file.readUTF();
			String answer = file.readUTF();
			
			
			quiz[i-1]= new Question(id, prompt, answer);
			
			}
			
			Scanner keyBoardInput = new Scanner(System.in);
			
			for(int a = 0; a <= 9; a++) {
				
				System.out.println(quiz[a].prompt);
				
				String userAnswer = keyBoardInput.nextLine();
				
				if(userAnswer.equals(quiz[a].answer)) {
					score++;
					
				}
				System.out.println("You got " + score + "/ 10");
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
		
		return score;	
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter \n 1. to initailize file \n 2. add questions \n 3. to take test. ");
		
		Scanner kbScanner = new Scanner(System.in);
		
		String userInput = kbScanner.nextLine();
		
		int choice = Integer.parseInt(userInput);
			
		
		switch(choice) {
		
		case 1 :
			//ToDo: Check if file was initialized before
			initialize("test.dat");
			break;
			
		case 2 : 
			//ToDo: Accept question id, question and answer from staff 
			writeRecord(new Question(1,"Question 2", "b"));
			break;
		
		case 3:
			//ToDo: Store result in result file
			takeTest("test.dat");
			break;
			
		default: 
			System.out.println("Default option");
		}
			
		
		
		
		
		}

}
