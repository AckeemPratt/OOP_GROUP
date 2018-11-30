//Chadan Huggup
//Ricardo Gowdie
//Ackeem Pratt
//Shevaughn Williams


import java.util.Scanner;
import java.io.IOException;
import java.io.RandomAccessFile;
/////////////////////////////password file codes//////////////////
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
////////////////password file codes end///////////////////////
	
///////////////student record file codes////////////////////
/*

	public static void initializeStudent(String filename) {
		RandomAccessFile file = null;
		try {
			file = new RandomAccessFile(filename, "rw");
			Student stud = new Student();

			for (int idx = 1; idx <= 100; idx++) {
				file.seek((idx - 1) * stud.sizeof());
				file.writeInt(stud.getIdNumber());
				file.writeUTF(stud.getFirstName());
				file.writeUTF(stud.getLastName());
				file.writeUTF(stud.getAddress());
				file.writeInt(stud.getDateEnrolled().getDay());
				file.writeInt(stud.getDateEnrolled().getMonth());
				file.writeInt(stud.getDateEnrolled().getYear());
				file.writeUTF(stud.getContactNumber());
				file.writeUTF(stud.getProgramme().getProgramme());
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
	}//student record initialize end
	
	
	//student record write
	public static void writeRecord(Samsung cell) {
		RandomAccessFile file = null;
		String filename = "test.tst";
		try {
			file = new RandomAccessFile(filename, "rw");

			file.seek((cell.getImei() - 1) * cell.sizeof());
			file.writeInt(cell.getImei());
			file.writeUTF(cell.getModel());
			file.writeUTF(cell.getNetwork());
			file.writeFloat(cell.getWapVersion());
			file.writeUTF(cell.getDataProtocol());
			
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
	//student record write end
	public static Samsung readRecord(int search) {
		RandomAccessFile file = null;
		String filename = "test.tst";
		Samsung cell = new Samsung();
		
		try {
			file = new RandomAccessFile(filename, "rw");
			
			file.seek((search - 1) * cell.sizeof());
			int imei = file.readInt();
			String model = file.readUTF();
			String network = file.readUTF();
			float wapVersion = file.readFloat();
			String dataProtocol = file.readUTF();
			
			cell = new Samsung(imei, model, network, wapVersion, dataProtocol);
			
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
		
		return cell;
	}	
	//student read
	
	//student read end
*/
////////////student record file codes end////////////////////
 

	
///////////////write result to file////////////////////


public static void initializeResult(String filename) {
RandomAccessFile file = null;
try {
	file = new RandomAccessFile(filename, "rw");
	Result res = new Result();

	for (int idx = 1; idx <= 100; idx++) {
		file.seek((idx - 1) * res.sizeof());
		file.writeInt(res.getId());
		file.writeUTF(res.getFirstName());
		file.writeUTF(res.getLastName());
		file.writeInt(res.getScore());
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
}//Result record initialize


//Result record write
public static void writeResult(Result res) {
RandomAccessFile file = null;
String filename = "Result.dat";
try {
	file = new RandomAccessFile(filename, "rw");

	file.seek((res.getId() - 1) * res.sizeof());
	file.writeInt(res.getId());
	file.writeUTF(res.getFirstName());
	file.writeUTF(res.getLastName());
	file.writeUTF(res.getTest());
	file.writeInt(res.getScore());
	
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
//Result record write end

public static Result readResult(int idx) {
RandomAccessFile file = null;
String filename = "Result.dat";
Result res = new Result();

try {
	file = new RandomAccessFile(filename, "rw");
	
	file.seek((idx - 1) * res.sizeof());
	int id = file.readInt();
	String firstName = file.readUTF();
	String lastName = file.readUTF();
	String test = file.readUTF();
	int score = file.readInt();
	
	res = new Result(id, firstName, lastName, test, score);
	
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

return res;
}	
//Result read end

//////////////////write result to file end////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
			
/////////////////////////////Teacher bracket starts/////////////////////////			
			if (userId == 1000 && userPassword.equals("teacher")) {
				System.out.print("Teacher logged in\n\n");
				
				Scanner inputRecord = new Scanner(System.in);
				String firstName;
				String lastName;
				String faculty;
				String department;
				int day;
				int month;
				int year;
				
				
				
				System.out.print("Enter first name\n");
				firstName = inputRecord.nextLine();
				
				System.out.print("Enter last name\n");
				lastName = inputRecord.nextLine();
				
				System.out.print("Enter faculty\n");
				faculty = inputRecord.nextLine();
				
				System.out.print("Enter department\n");
				department = inputRecord.nextLine();
				
				System.out.print("Enter day employed\n");
				day = inputRecord.nextInt();
				
				System.out.print("Enter month employed\n");
				month = inputRecord.nextInt();
				
				System.out.print("Enter year employed\n");
				year = inputRecord.nextInt();
				
				Date dateEmployed = new Date(day, month, year);
				StaffRec teach1 = new StaffRec(userId, firstName, lastName, faculty, department, dateEmployed);
				System.out.print(teach1);
				
			
			int choice;
			Scanner input = new Scanner(System.in);
			do {
				System.out.println("Please Select Option below ");
				System.out.println("1. View Test Result");
				System.out.println("2. Set Test");
				System.out.println("3. Exit\n");
				choice=input.nextInt();
				
				switch(choice) {
				case 1:
					System.out.print("View Test Result selected\n\n");
					
					
					
					break;
				case 2:
					System.out.print("Set Test selected\n\n");
					
					String fileName = "mathematics.dat";
					String subject = "mathematics";
					
					//app.initialize("test.dat");//run once then good.
					app.initialize(fileName);
					app.writeRecord(subject);
					
					
					
					
					
					//new app().initialize(fileName);
					//new app().writeRecord(fileName);
					//new app().takeTest(fileName);
					
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
			
////////////////////////////Student bracket starts////////////////////////			
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
				System.out.println("1. Take Test");
				System.out.println("2. Enroll in Programme");//to take out
				System.out.println("3. View Test Result");
				System.out.println("4. Exit");
				choice=input.nextInt();
				
				switch(choice) {
				
				case 1:
					System.out.print("Take Test selected\n\n");
					
					if (programmeOption.equals("associate degree")) {
						System.out.print("Associate Degree test options will be given\n");
						
						Scanner inputTest = new Scanner(System.in);
						int testChoice=0;
						
						do {
							System.out.print("1. Mathematics\n2. Accounting\n3. Biology\n4. Computing\n5. Entrepreneurship\n6. InformationTechnology\n7. Physics\n8. Psycology\n9. Exit\n\n");
							
							testChoice = inputTest.nextInt();
							String fileName;
							
							switch(testChoice) {
							case 1:
								System.out.print("Mathematics test selected\n");
								
								fileName = "mathematics.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
								
							case 2:
								System.out.print("Accounting test selected\n");
								fileName = "accounting.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 3:
								System.out.print("Biology test selected\n");
								fileName = "biology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 4:
								System.out.print("Computing test selected\n");
								fileName = "computing.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 5:
								System.out.print("Entrepreneur test selected\n");
								fileName = "entrepreneurship.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 6:
								System.out.print("Information Technology test selected\n");
								fileName = "informationTechnology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 7:
								System.out.print("Physics test selected\n");
								fileName = "physics.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 8:
								System.out.print("Psycology test selected\n");
								fileName = "psycology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
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
						
						Scanner inputTest = new Scanner(System.in);
						int testChoice=0;
						
						do {
							System.out.print("1. Mathematics\n2. Accounting\n3. Biology\n4. Physics\n5. Entrepreneurship\n6. InformationTechnology\n9. Exit\n\n");
							
							testChoice = inputTest.nextInt();
							String fileName;
							
							switch(testChoice) {
							case 1:
								System.out.print("Mathematics test selected\n");
								
								fileName = "mathematics.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
								
							case 2:
								System.out.print("Accounting test selected\n");
								fileName = "accounting.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 3:
								System.out.print("Biology test selected\n");
								fileName = "biology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 4:
								System.out.print("Physics test selected\n");
								fileName = "physics.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 5:
								System.out.print("Entrepreneur test selected\n");
								fileName = "entrepreneurship.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 6:
								System.out.print("Information Technology test selected\n");
								fileName = "informationTechnology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 9:
								System.out.print("Diploma tests menu exited\n");
								break;
							default:
								System.out.print("Invalid menu option selected, please choose between 1-8\n");
								break;
							}
						}while(testChoice!=9);
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					}else if (programmeOption.equals("certificate")) {
						System.out.print("Certificate test options will be given\n");
						
						Scanner inputTest = new Scanner(System.in);
						int testChoice=0;
						
						do {
							System.out.print("1. Entrepreneurship\n2. InformationTechnology\n3. Physics\n4. Psycology\n9. Exit\n\n");
							
							testChoice = inputTest.nextInt();
							String fileName;
							
							switch(testChoice) {
							case 1:
								System.out.print("Entrepreneur test selected\n");
								fileName = "entrepreneurship.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 2:
								System.out.print("Information Technology test selected\n");
								fileName = "informationTechnology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 3:
								System.out.print("Physics test selected\n");
								fileName = "physics.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 4:
								System.out.print("Psycology test selected\n");
								fileName = "psycology.dat";
								System.out.print("Test begin\n");
								app.takeTest(fileName);
								break;
							case 9:
								System.out.print("Certificate tests menu exited\n");
								break;
							default:
								System.out.print("Invalid menu option selected, please choose between 1-8\n");
								break;
							}
						}while(testChoice!=9);
						
					}else {
						System.out.print("You have an error accessing appropriate test. please restart program. Check program spelling next time\n");// use case for programme selection
					}
					
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
					System.out.print("View Test Result selected\n\n");
					//Result result1 = new Result(userId, firstName, lastName, );//still working
					
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

