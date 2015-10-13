import java.util.Scanner;
public class Bank {
	public static void main(String arg[]){
		//int account;
		int counter = 0;
		int x ;
		String name;
		String address;
		String location;
		String account;
		String mobile;
		String date;
		Scanner in = new Scanner(System.in);
		
		//(x=0;x <=4;x++){
			System.out.println("01 For new Account");
			System.out.println("02 Deposit");
			System.out.println("03 For Withdraw");
			System.out.println("04 For EXIT");
			counter = in.nextInt();
		//}
		switch(counter){
		case 1:
		
		System.out.println("New Account");
		System.out.println("ENTER YOUR FULL NAMES");
		name = in.nextLine();
		System.out.println("ENTER YOUR ACCOUNT NUMBER");
		account = in.nextLine();
		System.out.println("ENTER YOUR LOCATION (physical address)");
		location = in.nextLine();
		System.out.println("ENTER YOUR MOBILE NUMBER");
		mobile = in.nextLine(); 
		break;
		
		case 2:
		
			System.out.println("ENTER YOUR DEPOSIT");
			break;
		
		case 3:
		
			System.out.println("ENTER THE AMOUNT YOU WANT TO WITHDRAW");
			break;
		case 4:
                       break;	
		
		
		default:
			System.out.println("Wrong entry");
			break;
		
		}
			}

}
