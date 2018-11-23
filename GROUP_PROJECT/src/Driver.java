import java.util.Scanner;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Driver {
	//initialize blank password file
	public static void initializePassword(String filename) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "rw");
			Login credential = new Login();

			for (int idx = 1; idx <= 2; idx++) {
				file.seek((idx - 1) * credential.sizeof());
				file.writeInt(credential.getId());
				file.writeUTF(credential.getPassword());
			}

		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}//end of initialize blank password file method
	
	//write id and password to file method
	public static void writePassword(Login cell) {
		RandomAccessFile file = null;
		String filename = "Password.tst";
		try {
			file = new RandomAccessFile(filename, "rw");

			file.seek((cell.getId() - 1) * cell.sizeof());
			file.writeInt(cell.getId());
			file.writeUTF(cell.getPassword());
			
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
	}//write password to file method end
	
	
	public static Login readPassword(int searchIndex) {
		RandomAccessFile file = null;
		String filename = "Password.tst";
		Login credential = new Login();
		
		try {
			file = new RandomAccessFile(filename, "rw");
			
			file.seek((searchIndex - 1) * credential.sizeof());
			int id = file.readInt();
			String password = file.readUTF();
			
			credential = new Login(id, password);
			
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		
		return credential;
	}//read credential method end
	
	
	//main
	public static void main(String[] args) {
		//initialize password file
		initializePassword("Password.tst");
		
		//write password for staff and student
		writePassword(new Login(1000,"teacher"));
		writePassword(new Login(2000,"student"));
		
		Scanner credentialScan=new Scanner(System.in);
		
		System.out.print("Enter ID as username\n");
		int userId = credentialScan.nextInt();
		
		System.out.print("Enter password\n");
		String userPassword = credentialScan.next();
		
		if (userId == 1000 && userPassword.equals("teacher")) {
			System.out.print("Teahcer logged in\n");
			
			int choice=0;
			Scanner input=new Scanner(System.in);
			
			do {
				System.out.println("Please Select Option below ");
				System.out.println("1. View Test Result");
				System.out.println("2. Set Test");
				System.out.println("3. Exit");
				
				switch(input.nextInt()) {
				case 1:
					System.out.print("option 1 selected\n");
					break;
				case 2:
					System.out.print("option 2 selected\n");
					break;
				case 3:
					System.out.print("option 3 selected\n");
					break;
				default:
					System.out.print("default option\n");
					break;
					
				}
				
			}while(input.nextInt() !=3);
			System.out.print("Teacher exited system\n");
			//end of student menu
			
			
			
		}
		
		if (userId == 2000 && userPassword.equals("student")) {
			System.out.print("Student logged in\n");
			
			
			int choice=0;
			Scanner input=new Scanner(System.in);
			
			do {
				System.out.println("Please Select Option below ");
				System.out.println("1. View Test Result");
				System.out.println("2. Take Test");
				System.out.println("3. Exit");
				
				switch(input.nextInt()) {
				case 1:
					System.out.print("option 1 selected\n");
					break;
				case 2:
					System.out.print("option 2 selected\n");
					break;
				case 3:
					System.out.print("option 3 selected\n");
					break;
				default:
					System.out.print("default option\n");
					break;
					
				}
				
			}while(input.nextInt() !=3);
			System.out.print("Student exited system\n");
			//end of student menu
			
			
			
			
		}
		
		
		
	}
	
		}

