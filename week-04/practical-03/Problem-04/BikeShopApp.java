class BikeShopApp {
	public static void main(String[] args) {

        // indicate whether to keep running the program
        boolean continueRunning = true; 

        // Empty integer with the information option (Summarized or complete)
        int optionInfo = 0;
        
        // This is the inventory of current bikes in the store, I used Polimorphism to store different bikes in a single Bycicle Array
        Bicycle[] inventory = {new ElectricBike(1, "Green", 2012, 3 , false, "03-04-2020", "Not Checked out", "Becky G.",30.0d),
            new MountainBike(2, "Light Blue", 2019, 21 , false, "16-03-2020", "Not Checked out", "Karol G.","Shimano 43 Plus","KHS 2.4"),
            new RoadBike(3, "Red", 1942, 7 , false, "14-03-2020", "Not Checked out", "Wisin Y.","Swalve Extra"),
            new Hibrid(4, "White", 2005, 14 , true, "01-04-2020", "Not Checked out", "Becky G.","Shimano360"),
            new RoadBike(5, "Black", 2012, 21 , true, "02-02-2020", "30-03-2020", "Wisin Y.","Kmart Cheap Value suspension"),
            };

        // Welcome message
        System.out.println("Welcome to the Bicycle shop app");
        System.out.println("Helping your store track bike repairing since 2020!");
        System.out.println("---------------------------");
        
		while(continueRunning) {
			// Show the options to the user
			AppOptions.displayOptions();

			// Read user's option
			int option = AppOptions.readOption();

            switch(option) {

                // Option 1 prints the information of the bikes under repairing
                case 1:

                    // Ask the user if wants the complete or summarized information
                    System.out.println("How do you want the information to be displayed?");
                    System.out.println("1) Complete information");
                    System.out.println("2) Summarized information");

                    // Read user option
                    optionInfo = AppOptions.readOption();

                    System.out.println("-----------------------");
                    System.out.println("Bikes under repairing:");

                    for (int i=0; i < inventory.length;i++) {
                        
                        if (!inventory[i].getIs_serviced()) {
                            // The argument of display info is 1 to get the complete information and 2 to get the summary
                            inventory[i].displayInfo(optionInfo);
                        }
                    }
                    System.out.println("-----------------------");
                    break;
                
                // Option 2 prints the information of the already checked out bikes
                case 2:

                    System.out.println("How do you want the information to be displayed?");
                    System.out.println("1) Complete information");
                    System.out.println("2) Summarized information");
                    optionInfo = AppOptions.readOption();

                    System.out.println("-----------------------");
                    System.out.println("Checked out bikes:");

                    for (int i=0; i < inventory.length;i++) {
                        
                        if (inventory[i].getIs_serviced()) {
                            inventory[i].displayInfo(optionInfo);
                        }

                    }
                    System.out.println("-----------------------");
                    break;
                
                // Option 3 is for checking out the bikes
                case 3:

                    System.out.println("-----------------------");
                    System.out.println("Bikes under repairment");

                    for (int i=0; i < inventory.length;i++) {
                        
                        // Displays a summary of the bikes under repairment
                        System.out.println("-------------------");
                        if (!inventory[i].getIs_serviced()) {
                            inventory[i].displayInfo(2);
                        }

                    }
                    // Read the ID of the bike to check out
                    int IDCheckOut = AppOptions.readID();

                    // Read date of check out
                    String checkOutDate = AppOptions.readDate();

                    // this validID boolean is to figure if the bike is in the inventory
                    boolean  validID = false;
                    
                    // Scan the inventory for the ID
                    for (int i=0; i < inventory.length;i++) {
                        
                        // Check the match
                        if ((inventory[i].getID()== IDCheckOut)  && (!inventory[i].getIs_serviced())) {
                            // Use the check out function to change the status of the bike
                            inventory[i].checkoutService(checkOutDate);
                            validID = true;
                        }

                    }

                    // Print message if the ID was found
                    if (validID) {
                        System.out.println("Bycicle ID " + IDCheckOut + " has been successfully checked out on " + checkOutDate);
                    } else {
                        // Print message if the bike was not found
                        System.out.println("Error: Invalid ID, bike not found");
                    }

                    break;

                // Option 4 is for exiting the app
                case 4:
                    
                // Print warnign message as the app doesnt save changes
                    System.out.println("------------------------------------------");
                    System.out.println("Warning: Your information will not be saved");
                    System.out.println("Are you sure you want to exit the app?");
                    System.out.println("1) I am sure, exit the app");
                    System.out.println("2) No, continue using the app");

                    // Read user option
                    int exitOption = AppOptions.readOption();

                        // Only if one exit app
                        if (exitOption == 1) {
                            continueRunning = false; 
                        }

                    break;

                default:
                    System.out.println("Please input a valid option");
                    break;
            }
		}
	}
}