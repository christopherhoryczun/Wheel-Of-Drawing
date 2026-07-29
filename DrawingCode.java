//Package
package personalProjects;

//Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DrawingCode {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		String wannaPlayaGame;
		// Intro
		System.out.println("Welcome to Drawing Ideas 3000");
		System.out.println();
		
		do {
			System.out.print("Would you like an idea (Y/N): ");
			wannaPlayaGame = scanner.nextLine().trim().toUpperCase();
			} while (!wannaPlayaGame.equals("Y") && !wannaPlayaGame.equals("N"));
		
		// Main Idea Loop
		while (wannaPlayaGame.equals("Y")) {
			giveAnIdea();
			System.out.print("Would you like a different idea (Y/N): ");
			wannaPlayaGame = scanner.nextLine().trim().toUpperCase();
			
			while (!wannaPlayaGame.equals("Y") && !wannaPlayaGame.equals("N")) {
				System.out.print("Please enter Y or N: ");
				wannaPlayaGame = scanner.nextLine().trim().toUpperCase();
				}
			}
		System.out.println("Thank you for your time. Have a good day!");
		scanner.close();

	}

	private static void giveAnIdea() {
		List<String> tattoo = new ArrayList<>();
        tattoo.add("logos");
        tattoo.add("Locations");
        tattoo.add("Buildings");
        tattoo.add("Vehicles [i.e cars,trucks,boats,trains]");
        tattoo.add("Kitchen Tools [i.e cup,bowls,table]");
        tattoo.add("Kitchen Tool with faces");
        tattoo.add("Word Art");
        tattoo.add("Weapons");
        tattoo.add("Animals [on things]");
        tattoo.add("real and not real Animals");
        tattoo.add("Pattern Art w/ Words");
        tattoo.add("Pattern Art");
        tattoo.add("Eyes");
        tattoo.add("People");
        tattoo.add("Fish");
        tattoo.add("Movie related things [i.e Alice and Wonderland]");
        tattoo.add("DNA w/ things");
        tattoo.add("lava lamp");
        tattoo.add("MythoGraphic");
        tattoo.add("Flowers");
        tattoo.add("Feathers");
        tattoo.add("Mashroom House");
        tattoo.add("Candle");
        tattoo.add("Optical Illusions");
        tattoo.add("Free hand Drawing");
        tattoo.add("Cartoon Characters [i.e Simpsons, Family Guy]");
        Random random = new Random();
        int randomIndex = random.nextInt(tattoo.size());
        String randomWord = tattoo.get(randomIndex);
        System.out.println("What about drawing: " + randomWord);
        return;
		
	}

}
