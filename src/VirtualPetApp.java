import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VirtualPet dog1 = new VirtualPet(null, 5, 18, 5, 5, 5);

		System.out.println("Welcome to VirtualPet! Meet your new doggie!");
		System.out.println("Cute, isn't he? Let's give him a name. \nWhat would you like his name to be?");
		String nameChoice = input.nextLine();
		dog1.setName(nameChoice.substring(0, 1).toUpperCase() + nameChoice.substring(1).toLowerCase());

		System.out.println(dog1.getName() + ": \"Woof!\"");
		System.out.println("I think he likes it. :)");
		System.out.println("It's your job to take care of " + dog1.getName() + "."
				+ "\nMake sure he doesn't get too hungry, thirsty, bored, or tired.");
		boolean gameActive = true;

		while (gameActive) {

			if (dog1.checkDead()) {
				System.out.println(
						dog1.getName() + " has died.\nYou did a bad job and you should feel bad.\nGame Over. :(");
				gameActive = false;
				System.exit(0);
			}

			if (dog1.checkHungry()) {
				System.out.println(dog1.getName() + " is hungry.");
			}
			if (dog1.checkThirsty()) {
				System.out.println(dog1.getName() + " is thirsty.");
			}
			if (dog1.checkPottyTime()) {
				System.out.println(dog1.getName() + " needs to potty.");
			}
			if (dog1.checkBored()) {
				System.out.println(dog1.getName() + " is bored.");
			}
			if (dog1.checkSleepy()) {
				System.out.println(dog1.getName() + " is sleepy.");
			}

			System.out.println("Press 1 to feed " + dog1.getName() + ".");
			System.out.println("Press 2 to give " + dog1.getName() + " some water.");
			System.out.println("Press 3 to play with " + dog1.getName() + ".");
			System.out.println("Press 4 to let " + dog1.getName() + " sleep.");
			System.out.println("Press 5 to take " + dog1.getName() + " out to potty.");
			System.out.println("Press 6 to do nothing.");
			System.out.println("Press 7 to exit the game.");
			String choice = input.next();

			if (choice.contains("1")) {
				dog1.feed();
			} else if (choice.contains("2")) {
				dog1.giveWater();
			} else if (choice.contains("3")) {
				dog1.play();
			} else if (choice.contains("4")) {
				dog1.letSleep();
			} else if (choice.contains("5")) {
				dog1.takeOutside();
			} else if (choice.contains("6")) {
				System.out.println("Fine, just let the poor thing suffer then... ~_~");
			} else if (choice.contains("7")) {
				gameActive = false;
			} else {
				System.out.println("That's not an option.");
			}

			dog1.tick();

		}
		input.close();
	}

}
