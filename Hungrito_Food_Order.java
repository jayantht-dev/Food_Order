import java.util.*;
public class Hungrito_Food_Order {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		System.out.println("\t**Welcome to Hungrito**");
		System.out.println("----------------------------------------");
		System.out.println("Select the Restaurant");
		System.out.println("1.Buhari\n2.S.S Hyderabad\n3.Nandhana Palace\n4.Bilal\n5.Dindigul Thalappakatti - Since 1957");
		System.out.println("----------------------------------------");
		System.out.print("Enter your selection: ");
		int user_input = sc.nextInt();
		System.out.println("Redirecting...Please wait...");
		Thread.sleep(2000);
		switch(user_input) {
		//Restaurant 1---------------------------------------------------------------------------------
		case 1: {
			//Buhari menu 
			System.out.println("\n\t**Welcome to Buhari**");
			System.out.println("\t---------------------");
			System.out.println("---Buharis Special Barbeque---");
			System.out.println("1.Grilled Chicken 1/4     - 130");
			System.out.println("2.BBQ Chicken 1/4         - 130");
			System.out.println("\n---Biryani---");
			System.out.println("3.Mutton Biryani          - 520");
			System.out.println("4.Chicken Biryani         - 420");
			System.out.println("5.Chicken 65 Biryani      - 460");
			System.out.println("----------------------------------------");
			System.out.print("\nAnything to Order: ");
			int food_selection = sc.nextInt();
			
			//Buhari Food selection 1
			switch(food_selection) {
			case 1:{
				double price = 130;
				System.out.println("Your Item: Grilled Chicken 1/4");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Grilled Chicken 1/4\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Grilled Chicken 1/4\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Buhari Food selection 2
			case 2:{
				double price = 130;
				System.out.println("Your Item: BBQ Chicken 1/4");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: BBQ Chicken 1/4\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: BBQ Chicken 1/4\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Buhari Food selection 3
			case 3:{
				double price = 520;
				System.out.println("Your Item: Mutton Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						
						//OTP generation
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Buhari Food selection 4
			case 4:{
				double price = 420;
				System.out.println("Your Item: Chicken Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Chicken Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Chicken Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Buhari Food selection 5
			case 5:{
				double price = 460;
				System.out.println("Your Item: Chicken 65 Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Buhari Restaurant**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			default:
				System.out.println("Invalid selection");
			}
			break;}
		
		//Restaurant 2---------------------------------------------------------------------------------
		case 2: {
			//S.S Hyderabad menu
			System.out.println("\n\t**Welcome to S.S Hyderabad**");
			System.out.println("\t----------------------------");
			System.out.println("---Starter---");
			System.out.println("1.Hyderabadi Tandoori Chicken      - 210");
			System.out.println("2.Chilli Chicken(Dry)              - 130");
			System.out.println("\n---Biryani/Fried_Rice---");
			System.out.println("3.Hyderabadi Chicken Dum Biryani   - 299");
			System.out.println("4.Chicken Fried Rice               - 270");
			System.out.println("5.Egg Fried Rice                   - 250");
			System.out.println("----------------------------------------");
			System.out.print("\nAnything to Order: ");
			int food_selection = sc.nextInt();
			
			//S.S Hyderabad Food selection 1
			switch(food_selection) {
			case 1:{
				double price = 210;
				System.out.println("Your Item: Hyderabadi Tandoori Chicken");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Hyderabadi Tandoori Chicken\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Hyderabadi Tandoori Chicken\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//S.S Hyderabad Food selection 2
			case 2:{
				double price = 130;
				System.out.println("Your Item: Chilli Chicken(Dry)");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Chilli Chicken(Dry)\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Chilli Chicken(Dry)\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//S.S Hyderabad Food selection 3
			case 3:{
				double price = 299;
				System.out.println("Your Item: Hyderabadi Chicken Dum Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						
						//OTP generation
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Hyderabadi Chicken Dum Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Hyderabadi Chicken Dum Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//S.S Hyderabad Food selection 4
			case 4:{
				double price = 270;
				System.out.println("Your Item: Chicken Fried Rice");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Chicken Fried Rice\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Chicken Fried Rice\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//S.S Hyderabad Food selection 5
			case 5:{
				double price = 250;
				System.out.println("Your Item: Egg Fried Rice");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Egg Fried Rice\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**S.S Hyderabad**\nBill no: 120\nYour Order: Egg Fried Rice\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			default:
				System.out.println("Invalid selection");
				break;
			}
			break;}
		
		//Restaurant 3---------------------------------------------------------------------------------
		case 3: {
			//Nandhana Palace menu
			System.out.println("\n\t**Welcome to Nandhana Palace**");
			System.out.println("\t------------------------------");
			System.out.println("---Starters---");
			System.out.println("1.Andhra Chicken Kebab               - 325");
			System.out.println("2.Chicken 555 Boneless               - 360");
			System.out.println("\n---Biryani/Fried_Rice---");
			System.out.println("3.Supreme Chicken Boneless Biryani   - 330");
			System.out.println("4.Chicken-Lollipop Biryani           - 299");
			System.out.println("5.Chicken 65 Biryani                 - 225");
			System.out.println("------------------------------------------");
			System.out.print("\nAnything to Order: ");
			int food_selection = sc.nextInt();
			
			//Nandhana Palace Food selection 1
			switch(food_selection) {
			case 1:{
				double price = 325;
				System.out.println("Your Item: Andhra Chicken Kebab");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Andhra Chicken Kebab\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Andhra Chicken Kebab\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Nandhana Palace Food selection 2
			case 2:{
				double price = 360;
				System.out.println("Your Item: Chicken 555 Boneless");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken 555 Boneless\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken 555 Boneless\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Nandhana Palace Food selection 3
			case 3:{
				double price = 330;
				System.out.println("Your Item: Supreme Chicken Boneless Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						
						//OTP generation
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Supreme Chicken Boneless Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Supreme Chicken Boneless Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Nandhana Palace Food selection 4
			case 4:{
				double price = 299;
				System.out.println("Your Item: Chicken-Lollipop Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken-Lollipop Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken-Lollipop Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Nandhana Palace Food selection 5
			case 5:{
				double price = 225;
				System.out.println("Your Item: Chicken 65 Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Nandhana Palace**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			default:
				System.out.println("Invalid selection");
				break;
			}
			
			break;}
		
		//Restaurant 4---------------------------------------------------------------------------------
		case 4: {
			//Mount Road Bilal menu
			System.out.println("\n\t**Welcome to Mount Road Bilal**");
			System.out.println("\t-------------------------------");
			System.out.println("---Starters---");
			System.out.println("1.Chicken 65          - 301");
			System.out.println("2.Fish Finger         - 498");
			System.out.println("\n---Biryani---");
			System.out.println("3.Mutton Biryani      - 388");
			System.out.println("4.Chicken Biryani     - 314");
			System.out.println("5.Chicken 65 Biryani  - 460");
			System.out.println("---------------------------");
			System.out.print("\nAnything to Order: ");
			int food_selection = sc.nextInt();
			
			//Mount Road Bilal Food selection 1
			switch(food_selection) {
			case 1:{
				double price = 301;
				System.out.println("Your Item: Chicken 65");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken 65\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken 65\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Mount Road Bilal Palace Food selection 2
			case 2:{
				double price = 498;
				System.out.println("Your Item: Fish Finger");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Fish Finger\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Fish Finger\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Mount Road Bilal Palace Food selection 3
			case 3:{
				double price = 388;
				System.out.println("Your Item: Mutton Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						
						//OTP generation
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Mount Road Bilal Palace Food selection 4
			case 4:{
				double price = 314;
				System.out.println("Your Item: Chicken Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Mount Road Bilal Palace Food selection 5
			case 5:{
				double price = 460;
				System.out.println("Your Item: Chicken 65 Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2) {
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Mount Road Bilal**\nBill no: 120\nYour Order: Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			default:
				System.out.println("Invalid selection");
				break;
			}
			
			break;}
		
		//Restaurant 5---------------------------------------------------------------------------------
		case 5: {
			//Dindigul Thalappakatti menu
			System.out.println("\n\t**Welcome to Dindigul Thalappakatti - Since 1957**");
			System.out.println("\t--------------------------------------------------");
			System.out.println("---Starters---");
			System.out.println("1.Guntur Chicken Dry                          - 399");
			System.out.println("2.Thalappakatti Chicken Porichadu             - 415");
			System.out.println("\n---Biryani---");
			System.out.println("3.Thalappakatti Naidu Mutton Biryani          - 449");
			System.out.println("4.Thalappakatti Boneless Chicken 65 Biryani   - 420");
			System.out.println("5.Single Pasanga Chicken 65 Biryani           - 239");
			System.out.println("---------------------------------------------------");
			System.out.print("\nAnything to Order: ");
			int food_selection = sc.nextInt();
			
			//Dindigul Thalappakatti Food selection 1
			switch(food_selection) {
			case 1:{
				double price = 399;
				System.out.println("Your Item: Guntur Chicken Dry");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Guntur Chicken Dry\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						//OTP generation
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Guntur Chicken Dry\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tPAYMENT FAILED...Invalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Dindigul Thalappakatti Food selection 2
			case 2:{
				double price = 415;
				System.out.println("Your Item: Thalappakatti Chicken Porichadu");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Chicken Porichadu\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Chicken Porichadu\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Dindigul Thalappakatti Food selection 3
			case 3:{
				double price = 449;
				System.out.println("Your Item: Thalappakatti Naidu Mutton Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						
						//OTP generation
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Naidu Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Naidu Mutton Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Dindigul Thalappakatti Food selection 4
			case 4:{
				double price = 420;
				System.out.println("Your Item: Thalappakatti Boneless Chicken 65 Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Boneless Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Thalappakatti Boneless Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			
			//Dindigul Thalappakatti Food selection 5
			case 5:{
				double price = 239;
				System.out.println("Your Item: Single Pasanga Chicken 65 Biryani");
				System.out.print("Enter the Quantity: ");
				int qty = sc.nextInt();
				double bill = price*qty;
				System.out.println("\nTotal Bill: " + bill);
				
				//Order Confirmation------------------------------------------------
				System.out.println("\n\t---Order Confirmation---\n1.Proceed\n2.Cancel");
				System.out.print("Enter Confirmation: ");
				int order_confimation = sc.nextInt();
				
				//Payment Method----------------------------------------------------
				if(order_confimation==1) {
					System.out.println("\n\t---Payment Method---\n1.G-Pay\n2.Phone-Pay");
					System.out.print("Select option: ");
					int payment_selection = sc.nextInt();
					System.out.println("Redirecting..Please wait..");
					Thread.sleep(3000);
					if(payment_selection==1) {
						System.out.println("\n**Google_Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Single Pasanga Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}else if(payment_selection==2){
						System.out.println("\n**Phone-Pay**");
						int sys_otp = (int)(Math.random()*9999+9999);
						System.out.print("OTP - " + sys_otp);
						System.out.print("\nEnter the OTP: ");
						int user_otp = sc.nextInt();
						if(sys_otp == user_otp) {
							System.out.println("\nProcessing...");
							Thread.sleep(3000);
							System.out.println("\tPAYMENT SUCCESS");
							Thread.sleep(1000);
							System.out.println("\n\t**Dindigul Thalappakatti**\nBill no: 120\nYour Order: Single Pasanga Chicken 65 Biryani\nQty - " + qty);
							System.out.println("----------------------------------------");
							System.out.println("Total_Bill: " + bill);
							System.out.println("----------------------------------------");
							System.out.println("\tThank You Visit Again");
						}else {
							System.out.println("\n\tInvalid OTP");
						}
					}
					else
						System.out.println("\tInvalid Selection!");
				}
				else {
					System.out.println("\n\tThanks for Visiting!");
					break;
				}
				break;}
			default:
				System.out.println("Invalid selection");
				break;
			}
			
			break;}
		default:
			System.out.println("\t**Invalid Restaurant**");
		}
	}

}
