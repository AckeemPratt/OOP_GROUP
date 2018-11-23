import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		int choice=0;
		Scanner input=new Scanner(System.in);
		
		do {
			System.out.println("Please Select Option below ");
			System.out.println("1. Take Test");
			System.out.println("2. View test Result");
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
		System.out.print("system exited\n");
	}
	
		}

