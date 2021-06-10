
	import java.util.Scanner;
	public class FernsAndPetals 
	{
		static int rCount,tCount,sCount,sunflowerStock=15,roseStock=10,tulipsStock=25,updatedTulipsCount,updatedRoseCount,updatedsunflowerStock;
		static int choice,oldRoseStock,oldSunflowerStock,oldTulipsStock,roseCost=12,sunflwrCost=15,tulipsCost=16;
		static int tempRcount,tempScount,tempTcount;
		public static void main(String[] args) 
		{
			System.out.println("*****:  Hearty WelCome to Ferns And Petals  :*****");
			oldRoseStock=roseStock;
			oldSunflowerStock=sunflowerStock;
			oldTulipsStock=tulipsStock;
			menu();
		}
			public static void menu()
			{
				System.out.println("********* - Menu - ********");
				System.out.println("1.Show Inventory.\n2.Purchase.\n3.GenerateBill.\n4.Exit.");
				System.out.println("***************************\n");

//				System.out.println("Enter Your Choice:- ");
				System.out.println();
//				Scanner sc=new Scanner(System.in);
				choice=acceptChoice();
				if(choice>=1 && choice <=4)
				{
				switch(choice)
				{
				case 1:stock();
						break;
				case 2:purchaseOrder();
						break;
				case 3:generateBill();
						break;
					
				case 4:exit();
						break;
				}
				}
				else
				{
					System.out.println("Enter choice from 1 to 4.");
					continuee();
				}
			}
			
			public static void stock()
			{
				System.out.println("Stock in the Inventory is as below.");
				System.out.println("Available Sunflowers   : "+sunflowerStock+"\nAvailable Roses        : "+roseStock+"\nAvailable Tulips       : "+tulipsStock);
				continuee();
			}
			
			public static void continuee()
			{
				System.out.println("Do you want to continue your shopping?\n1.Yes.\n2.No.");
				System.out.println("Please say Yes or No by clicking 1 or 2.");
//				Scanner sc=new Scanner(System.in);
				choice=acceptChoice();
				if(choice>0 && choice<=2)
				{
				switch(choice)
				{
				case 1:menu();
						break;
				case 2:generateBill();
					break;
					
				}
				}
				else
				{
					System.out.println("Please enter correct choice, if want to continue press 1 if not press 2.");
					continuee();
				}
				}
				
			
			
			public static void purchaseOrder()
			{
				System.out.println("Please select the flower which you want to buy.\n1.Rose.\n2.Sunflower.\n3.Tulips.\n4.BacktoMainMenu.");
//				Scanner sc=new Scanner(System.in);
				choice=acceptChoice();
				if(choice >0 && choice <=4)
				{
				switch(choice)
				{
				case 1:System.out.println("Please specify , How many Roses you want?");
//						Scanner scan=new Scanner(System.in);
						rCount=acceptChoice();
						if(rCount >=0 && rCount<= roseStock)
						{
							tempRcount=tempRcount+rCount;
							updatedRoseCount=roseStock-rCount;
							roseStock=updatedRoseCount;
							rCount=0;
							System.out.println("Available roses after purchase : "+roseStock);
						}
						else
						{
							System.out.println(rCount+" Roses are not available right now. Please enter quantity lesser than or equal to : "+roseStock);
						}
						continuee();
//						scan.close();
						break;
					case 2:System.out.println("Please specify , How many Sunflowers you want?");
							//Scanner scan1=new Scanner(System.in);
							sCount=acceptChoice();
							if(sCount >=0 && sCount<= sunflowerStock)
							{
								tempScount=tempScount+sCount;//finalnalScount
								updatedsunflowerStock=sunflowerStock-sCount;
								sunflowerStock=updatedsunflowerStock;
								sCount=0;
								System.out.println("Available Sunflowers after purchase : "+sunflowerStock);
							}
							else
							{
								System.out.println(sCount+" Sunflowers are not available right now. Please enter quantity lesser than or equal to : "+sunflowerStock);
							}
							continuee();
//							scan1.close();
							break;
					case 3:System.out.println("Please specify , How many Tulips you want?");
					//Scanner scan11=new Scanner(System.in);
					tCount=acceptChoice();
					if(tCount >=0 && tCount<= tulipsStock)
					{
						tempTcount=tempTcount+tCount;
						updatedTulipsCount=tulipsStock-tCount;
						tulipsStock=updatedTulipsCount;
						tCount=0;
						System.out.println("Available Tulips after purchase : "+tulipsStock);
					}
					else
					{
						System.out.println(tCount+" Tulips are not available right now. Please enter quantity lesser than or equal to : "+tulipsStock);
					}
					continuee();
//					scan11.close();
					break;
					case 4://System.out.println("As you requested we are taking you to Main Menu but the current purchase details will not be saved.");
//					roseStock=oldRoseStock;
//					sunflowerStock=oldSunflowerStock;
//					tulipsStock=oldTulipsStock;
//					System.out.println("Rose count is : "+roseStock);
//					System.out.println("SunFlower count is : "+sunflowerStock);
//					System.out.println("Tulips count is : "+tulipsStock);
					System.out.println("As you requested we are taking you to main MENU with current purchase details saved.");
					menu();
					break;
				}	
				}
				else
				{
					System.out.println("You have entered incorrect value for choice.");
					continuee();
				}
			}
			
			public static void exit()
			{
				if(tulipsStock!=oldTulipsStock || sunflowerStock!=oldSunflowerStock || roseStock!=oldRoseStock)
				{
					generateBill();

				}
				else
				{
					System.out.println("There is nothing in your bucket do you want to shop again? ");
					continuee();

				}
			}
			
			public static void generateBill()
			{
				if(tulipsStock!=oldTulipsStock && sunflowerStock!=oldSunflowerStock && roseStock!=oldRoseStock)
				{
				System.out.println("    # # # Printing your bill please wait a while # # #");
				System.out.println("*********************************************************************************");
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
				System.out.println("---------------------------------------------------------------------------------");
				System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
				System.out.println("Rose/s             :      "+tempRcount+"     *       "+roseCost+"   =       "+(tempRcount*roseCost)                           );
				System.out.println("SunFlower/s        :      "+tempScount+"     *       "+sunflwrCost+"   =       "+(tempScount*sunflwrCost)                            );
				System.out.println("Tulips             :      "+tempTcount+"     *       "+tulipsCost+ "   =       " +(tempTcount*tulipsCost)                          );

				System.out.println("Total Flowers      :   "+(tempRcount+tempScount+tempTcount)+" & it's Total Amount is :   "+((tempTcount*tulipsCost)+(tempScount*sunflwrCost)+(tempRcount*roseCost)));
				System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
				System.out.println("\n*********************************************************************************");
				}
				else if(tulipsStock==oldTulipsStock && sunflowerStock!=oldSunflowerStock && roseStock!=oldRoseStock)
				{
					System.out.println("    # # # Printing your bill please wait a while # # #");
					System.out.println("*********************************************************************************");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
					System.out.println("Rose/s             :      "+tempRcount+"     *       "+roseCost+"   =       "+(tempRcount*roseCost)                           );
					System.out.println("SunFlower/s        :      "+tempScount+"     *       "+sunflwrCost+"   =       "+(tempScount*sunflwrCost)                            );
					System.out.println("Total Flowers      :   "+(tempRcount+tempScount+tempTcount)+" & it's Total Amount is :   "+((tempTcount*tulipsCost)+(tempScount*sunflwrCost)+(tempRcount*roseCost)));
					System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
					System.out.println("\n*********************************************************************************");
				}
				else if(tulipsStock!=oldTulipsStock && sunflowerStock==oldSunflowerStock && roseStock!=oldRoseStock)
				{
					System.out.println("    # # # Printing your bill please wait a while # # #");
					System.out.println("*********************************************************************************");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
					System.out.println("Rose/s             :      "+tempRcount+"     *       "+roseCost+"   =       "+(tempRcount*roseCost)                           );
					System.out.println("Tulips             :      "+tempTcount+"     *       "+tulipsCost+ "   =       " +(tempTcount*tulipsCost)                          );
					System.out.println("Total Flowers      :   "+(tempRcount+tempScount+tempTcount)+" & it's Total Amount is :   "+((tempTcount*tulipsCost)+(tempScount*sunflwrCost)+(tempRcount*roseCost)));
					System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
					System.out.println("\n*********************************************************************************");

				}
				else if(tulipsStock!=oldTulipsStock && sunflowerStock!=oldSunflowerStock && roseStock==oldRoseStock)
				{
					System.out.println("    # # # Printing your bill please wait a while # # #");
					System.out.println("*********************************************************************************");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
					System.out.println("SunFlower/s        :      "+tempScount+"     *       "+sunflwrCost+"   =       "+(tempScount*sunflwrCost)                            );
					System.out.println("Tulips             :      "+tempTcount+"     *       "+tulipsCost+ "   =       " +(tempTcount*tulipsCost)                          );

					System.out.println("Total Flowers      :   "+(tempRcount+tempScount+tempTcount)+" & it's Total Amount is :   "+((tempTcount*tulipsCost)+(tempScount*sunflwrCost)+(tempRcount*roseCost)));
					System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
					System.out.println("\n*********************************************************************************");
				}
				
				
					else if(tulipsStock!=oldTulipsStock && sunflowerStock==oldSunflowerStock && roseStock==oldRoseStock)
					{
						System.out.println("    # # # Printing your bill please wait a while # # #");
						System.out.println("*********************************************************************************");
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
						System.out.println("---------------------------------------------------------------------------------");
						System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
						System.out.println("Tulips             :      "+tempTcount+"     *       "+tulipsCost+ "   =       " +(tempTcount*tulipsCost)                          );
						System.out.println("Total Flowers      :   "+(tempRcount+tempScount+tempTcount)+" & it's Total Amount is :   "+((tempTcount*tulipsCost)+(tempScount*sunflwrCost)+(tempRcount*roseCost)));
						System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
						System.out.println("\n*********************************************************************************");
					}

				else if(tulipsStock==oldTulipsStock && sunflowerStock!=oldSunflowerStock && roseStock==oldRoseStock)
				{
					System.out.println("    # # # Printing your bill please wait a while # # #");
					System.out.println("*********************************************************************************");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
					System.out.println("---------------------------------------------------------------------------------");
					System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
					System.out.println("SunFlower/s        :      "+tempScount+"     *       "+sunflwrCost+"   =       "+(tempScount*sunflwrCost)                            );
					System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
					System.out.println("\n*********************************************************************************");
				}

				
				else if(tulipsStock==oldTulipsStock && sunflowerStock==oldSunflowerStock && roseStock!=oldRoseStock)
				{
					System.out.println("    # # # Printing your bill please wait a while # # #");
					System.out.println("*********************************************************************************");
					System.out.println("---------------------------------------------------------------------------------");;
					System.out.println("Ferns & Petals Pvt LTD.\n                               INVOICE");
					System.out.println("---------------------------------------------------------------------------------");;
					System.out.println("Product Description: Units Ordered * Price Per Unit = Total Amount.");
					System.out.println("Rose/s             :      "+tempRcount+"     *       "+roseCost+"   =       "+(tempRcount*roseCost)                           );

					System.out.println("\n       !! Thanks to Visit Ferns & Petals. Have A Good Day !!");
					System.out.println("\n*********************************************************************************");
				}

				else
				{
					System.out.println("        ***** No Item is purchased to generate the Bill. *****");
					System.out.println("       !! Thanks to Visit Ferns & Petals. please visit again !!");

				}
			}
			
			public static int acceptChoice()
			{
				boolean flag;
				int b=0;
		        do
		        {
		        	try
		        	{
		                        Scanner sc1 = new Scanner(System.in);
		                        System.out.println("Enter your choice ");
		                        b=sc1.nextInt();
		                        flag=false;
		        	}
		        	catch(Exception e)
		        	{
		        		// accept integer only.
		        		System.out.println("Enter only integer value.."+e);
		        		flag=true;
		        	}
		        }
		        while(flag);
		        return b;
			}
		        
	}
