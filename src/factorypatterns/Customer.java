package factorypatterns;

import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ComputerRecords computerRecord = new ComputerRecords();
        Computer comp = null;

        int choice;
        do {
            System.out.println("Choose a PC type");
            System.out.println("1. Desktop Computer");
            System.out.println("2. Laptop");
            System.out.println("3. Exit");
            System.out.print("Enter number: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1:
                        comp = new DesktopComputer(); 
                        
                        System.out.print("Enter computer's name: ");
                        String computerName = input.nextLine();
                        computerRecord.setcomputerName(computerName);
                        
                        System.out.print("Enter Computer's ID: ");
                        String computerId = input.nextLine();
                        computerRecord.setcomputerId(computerId);
                        
                        System.out.print("Enter storage: ");
                        int storages = input.nextInt();
                        computerRecord.setStorage(storages);
                        
                        System.out.print("Enter RAM: ");
                        int ram = input.nextInt();
                        computerRecord.	setRAM(ram);
                        computerRecord.setcomp(comp);
                        break;

                    case 2:
                        comp = new Laptop();
                        
                        System.out.print("Enter laptop's name: ");
                        String laptopName = input.nextLine();
                        computerRecord.setcomputerName(laptopName);
                        
                        System.out.print("Enter Laptop's ID: ");
                        String laptopId = input.nextLine();
                        computerRecord.setcomputerId(laptopId);
                        
                        System.out.print("Enter storage: ");
                        int storagess = input.nextInt();
                        computerRecord.setStorage(storagess);
                        
                        System.out.print("Enter RAM: ");
                        int ramm = input.nextInt();
                        computerRecord.	setRAM(ramm);
                        
                        computerRecord.setcomp(comp);
                        break;

                    case 3:
                        System.exit(0);
                }
                
                	System.out.println("Computer ID is " + computerRecord.getcomputerId());
                    System.out.println("Model of Computer is " + computerRecord.getcomputerName());
                    System.out.println("Computer type: " + computerRecord.getcomp().getClass().getSimpleName());
                    System.out.println("Storage: " + computerRecord.getStorage()+ "TB") ;
                    System.out.println("RAM: " + computerRecord.getRAM() + "gb");
                    System.out.println("Functionality: " + comp.createComputer());
                    System.out.println("Open mode: " + comp.open());
                    System.out.println();	
                
            } else {
                System.out.println("Invalid number. Select 1-3 only.");
                System.out.println();
            }

        } while (choice != 3);

    }
}
