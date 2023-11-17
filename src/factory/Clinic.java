package factory;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        PetRecord petRecord = new PetRecord();
        Pet pet = null;
        int choice;

        do{
            System.out.println("Choose a pet");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Exit");
            System.out.print("Enter number: ");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1 || choice <= 3){
                switch (choice) {
                case 1:
                    pet = new Dog();
                    System.out.print("Enter dog's name: ");
                    String dogName = input.nextLine();
                    petRecord.setPetName(dogName);
                    String PetIdDog = input.nextLine();
                    petRecord.setPetId(PetIdDog);    
                    petRecord.setPet(pet);
                    System.out.print("Enter Dog's breed: ");
                    String dogBreed = input.nextLine();
                    ((Dog) pet).setBreed(dogBreed);
                    break;

                case 2:
                    pet = new Cat();
                    System.out.print("Enter cat's name: ");
                    String catName = input.nextLine();
                    petRecord.setPetName(catName);
                    System.out.print("Enter Cat's ID: ");
                    String PetIdCat = input.nextLine();
                    petRecord.setPetId(PetIdCat);
                    petRecord.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.exit(0);

            }
                System.out.println("Pet id is " + petRecord.getPetId());
                System.out.println("Pet name is " + petRecord.getPetName());
                System.out.println("Pet kind: " + petRecord.getPet().getClass().getSimpleName());
                System.out.println("Communication sound: " + petRecord.getPet().makeSound());
                System.out.println("Play mode: " + petRecord.getPet().play());
                System.out.println();
            }else{
                System.out.println("Invalid number. Select 1-3 only.");
            	System.out.println();
            }
            
        } while (choice != 3);

    }

}
