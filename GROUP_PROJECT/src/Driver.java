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
	public static void writePassword(Login credential) {
		RandomAccessFile file = null;
		String filename = "Password.tst";
		try {
			file = new RandomAccessFile(filename, "rw");

			file.seek((credential.getId() - 1) * credential.sizeof());
			file.writeInt(credential.getId());
			file.writeUTF(credential.getPassword());
			
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
	
	//read credential from file method
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
		int loginSuccess = 0;
		
		do {
			System.out.print("\nEnter ID as username\n");
			int userId = credentialScan.nextInt();
			
			System.out.print("Enter password\n");
			String userPassword = credentialScan.next();
			
			if ((userId == 2000 && userPassword.equals("student")) || (userId == 1000 && userPassword.equals("teacher"))) {
				System.out.print("\nLogin successful\n");
				loginSuccess = 1;
			}else{
					System.out.print("\nLogin failed, try again\n");
			}
			
			
			if (userId == 1000 && userPassword.equals("teacher")) {
				System.out.print("Teacher logged in\n\n");
			
			int choice;
			Scanner input = new Scanner(System.in);
			do {
				System.out.println("Please Select Option below ");
				System.out.println("1. View Test Result");
				System.out.println("2. Set Test");
				
				//initialize("test.dat");
				
				
				
				
				
				System.out.println("3. Exit\n");
				choice=input.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("View Test Result selected\n\n");
					break;
				case 2:
					System.out.print("Set Test selected\n\n");
					break;
				case 3:
					System.out.print("Exit selected\n\n");
					break;
				default:
					System.out.print("Invalid Selection, try again\n\n");
					break;			
				}	
			}while(choice!=3);
			System.out.print("Teacher exited system\n");
			
			}//end of teachers bracket
			
			
			//comes here with student login
			if (userId == 2000 && userPassword.equals("student")) {
				
				Scanner inputRecord = new Scanner(System.in);
				String firstName;
				String lastName;
				String address;
				int day;
				int month;
				int year;
				String contactNumber;
				String programmeOption;
				//CourseRec course = new CourseRec();
				
				System.out.print("Student logged in\n\n");
					
				
				System.out.print("Enter first name\n");
				firstName = inputRecord.nextLine();
				
				System.out.print("Enter last name\n");
				lastName = inputRecord.nextLine();
				
				System.out.print("Enter address\n");
				address = inputRecord.nextLine();
				
				System.out.print("Enter day enrolled\n");
				day = inputRecord.nextInt();
				
				System.out.print("Enter month enrolled\n");
				month = inputRecord.nextInt();
				
				System.out.print("Enter year enrolled\n");
				year = inputRecord.nextInt();
				
				System.out.print("Enter contact\n");
				contactNumber = inputRecord.nextLine();
				contactNumber = inputRecord.nextLine();
				
				
				System.out.print("You will now select a program\n");
				System.out.print("Enter program\n");
				programmeOption = inputRecord.nextLine();
				

				
				//have another way to to get courses. just use Programme to make it easier
				Date dateEnrolled = new Date(day, month, year);
				ProgrammeRec programme = new ProgrammeRec(programmeOption);
				Student stud1 = new Student(userId, firstName, lastName, address, dateEnrolled, contactNumber, programme);
				System.out.print(stud1);
			
			int choice;
			Scanner input = new Scanner(System.in);
			do {
				System.out.println("Please Select Option below\n");
				System.out.println("1. View Test Result");
				System.out.println("2. Enroll in Programme");//to take out
				System.out.println("3. Take Test");
				System.out.println("4. Exit");
				choice=input.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("View Test Result selected\n\n");
					break;
				case 2:
					System.out.print("Enroll in Programme selected\n\n");
					
					//take programme option which will then allow take test
					Scanner inputProgramme = new Scanner(System.in);
					int programmeChoice=0;
					
					
					do {
						System.out.print("Please select the Programme to enroll in\n1. Associate Degree\n2. Diploma\n3. Certificate\n4. Exit\n\n\n\n");
						programmeChoice = inputProgramme.nextInt();
						
						switch(programmeChoice) {
						case 1:
							System.out.print("Associate Degree Programme selected\n");
							System.out.print("Select test to take\n\n");
							
							
							
							break;
							
						case 2:
							System.out.print("Diploma Programme selected\n");
							System.out.print("Select test to take\n\n");
							break;
							
						case 3:
							System.out.print("Certificate selected\n");
							System.out.print("Select test to take\n\n");
							break;
							
						case 4:
							System.out.print("Enrollment menu exited\n\n");
							break;
							
						default:
							System.out.print("Invalid selection\n\n");
							break;
						}
					}while(programmeChoice !=4);
					break;
					
				case 3:
					System.out.print("Take Test selected\n\n");
					
					if (programmeOption.equals("associate degree")) {
						System.out.print("Associate Degree test options will be given\n");
						
						Scanner inputTest = new Scanner(System.in);
						int testChoice=0;
						
						do {
							System.out.print("1. first\n2. Second\n3. Third\n4. Fourth\n5. Fifth\n6. Sixth\n7. Seventh\n8. Eigth\n9. Exit\n\n");
							
							testChoice = inputTest.nextInt();
							
							switch(testChoice) {
							case 1:
								System.out.print("First test selected\n");
								break;
							case 2:
								System.out.print("Second test selected\n");
								break;
							case 3:
								System.out.print("Third test selected\n");
								break;
							case 4:
								System.out.print("Fourth test selected\n");
								break;
							case 5:
								System.out.print("Fifth test selected\n");
								break;
							case 6:
								System.out.print("Sixth test selected\n");
								break;
							case 7:
								System.out.print("Seventh test selected\n");
								break;
							case 8:
								System.out.print("Eigth test selected\n");
								break;
							case 9:
								System.out.print("Associate Degree tests menu exited\n");
								break;
							default:
								System.out.print("Invalid menu option selected, please choose between 1-8\n");
								break;
							}
						}while(testChoice!=9);
						
						
						//put take test method here
						
						
						
						
						
						
					}else if (programmeOption.equals("diploma")) {
						System.out.print("Diploma test options will be given\n");
					}else if (programmeOption.equals("certificate")) {
						System.out.print("Certificate test options will be given\n");
					}else {
						System.out.print("You have an error accessing appropriate test. please restart program. Check program spelling next time\n");// use case for programme selection
					}
					
					
					
					break;
				case 4:
					System.out.print("Main menu exited\n\n");
					break;
				default:
					System.out.print("Invalid Selection, try again\n\n");
					break;
				}
			}while(choice!=4);
			System.out.print("Student exited system");
			
	
			}//end of student bracket
		
		}while(loginSuccess!=1);
		
		
	}//end of main
	
		}

