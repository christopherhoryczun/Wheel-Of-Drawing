//Package
package personalProjects;

//Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class cherylsDrawingCode {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		String wannaPlayaGame;
		
		//Into
		System.out.println("Welcome to Drawing Ideas 3000");
		System.out.println();
		
		do {
			//Question Number One
			System.out.print("Would you like an idea (Y/N): ");
			wannaPlayaGame = scanner.nextLine().toUpperCase();
			
		} while (!wannaPlayaGame.equals("Y") && !wannaPlayaGame.equals("N"));
		if(wannaPlayaGame.equals("Y")) {
			giveAnIdea();
			
		} else {
			System.out.println("Thank for your Time. Have a good Day");
			
		}
	}//Main

	private static void giveAnIdea() {
		String understandType;
		
		optionTable();

		do {
			System.out.print("Would you like to know more about what each one is (Y/N): ");
			understandType = scanner.nextLine().toUpperCase();
			
		} while (!understandType.equals("Y") && !understandType.equals("N"));
		if (understandType.equals("Y")) {
			System.out.println("Going to example.....");
			examplePage();
		} else {
			pickaType();
		}
	}

	private static void examplePage() {
		System.out.println("\t\t\t\t" + "Go to the following link to learn more about each type");
		System.out.println();
		System.out.println("https://www.whataportrait.com/blog/types-of-drawing-styles/");
		
		System.out.println();
		optionTable();
		pickaType();
		
	}

	private static void pickaType() {
		int chooseaType;
		
		do {
			System.out.print("Which type would you like: ");
			chooseaType = scanner.nextInt();
		} while ((!(chooseaType >= 1)) && !(chooseaType <= 16));
		if (chooseaType >= 1 && chooseaType <=4) {
			 chooseOneToFour(chooseaType);
		}
		else if (chooseaType >= 5 && chooseaType <=8) {
			chooseFiveToeight(chooseaType);
		}
		else if (chooseaType >= 9 && chooseaType <= 12) {
			chooseNineToTwelve(chooseaType);
		}
		else if (chooseaType >= 13 && chooseaType <= 16) {
			chooseThirdteenToSixteen(chooseaType);
		}
	}

	private static void chooseOneToFour(int chooseaType) {
		if (chooseaType == 1) {
			allTheChoices();
		}
		else if (chooseaType == 2) {
			List<String> lineDrawing = new ArrayList<>();
	        lineDrawing.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(lineDrawing.size());
	        String randomWord = lineDrawing.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 3) {
			List<String> CartoonDrawing = new ArrayList<>();
			CartoonDrawing.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(CartoonDrawing.size());
	        String randomWord = CartoonDrawing.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 4) {
			List<String> photorealism = new ArrayList<>();
			photorealism.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(photorealism.size());
	        String randomWord = photorealism.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
	}

	private static void chooseFiveToeight(int chooseaType) {
		if (chooseaType == 5) {
			allTheChoices();
		}
		else if (chooseaType == 6) {
			List<String> architectural = new ArrayList<>();
			architectural.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(architectural.size());
	        String randomWord = architectural.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 7) {
			List<String> typographic = new ArrayList<>();
			typographic.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(typographic.size());
	        String randomWord = typographic.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 8) {
			List<String> geometric = new ArrayList<>();
			geometric.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(geometric.size());
	        String randomWord = geometric.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		
	}

	private static void allTheChoices() {
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

	private static void chooseNineToTwelve(int chooseaType) {
		if (chooseaType == 9) {
			List<String> diagrammatic = new ArrayList<>();
			diagrammatic.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(diagrammatic.size());
	        String randomWord = diagrammatic.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 10) {
			List<String> anamorphic = new ArrayList<>();
			anamorphic.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(anamorphic.size());
	        String randomWord = anamorphic.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 11) {
			List<String> stippling = new ArrayList<>();
			stippling.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(stippling.size());
	        String randomWord = stippling.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 12) {
			List<String> hatchingCrossHatching = new ArrayList<>();
			hatchingCrossHatching.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(hatchingCrossHatching.size());
	        String randomWord = hatchingCrossHatching.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}	
	}
	
	private static void chooseThirdteenToSixteen(int chooseaType) {
		if (chooseaType == 13) {
			List<String> scumblingScribbleArt = new ArrayList<>();
			scumblingScribbleArt.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(scumblingScribbleArt.size());
	        String randomWord = scumblingScribbleArt.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 14) {
			List<String> fashion = new ArrayList<>();
			fashion.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(fashion.size());
	        String randomWord = fashion.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);	
		}
		else if (chooseaType == 15) {
			List<String> pointillism = new ArrayList<>();
			pointillism.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(pointillism.size());
	        String randomWord = pointillism.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
		else if (chooseaType == 16) {
			List<String> perspective = new ArrayList<>();
			perspective.add("apple");
	        Random random = new Random();
	        int randomIndex = random.nextInt(perspective.size());
	        String randomWord = perspective.get(randomIndex);
	        System.out.println("What about drawing: " + randomWord);
		}
	}

	private static void optionTable() {
		System.out.println("\t\t\t\t" + "Drawing Ideas Choices/Types");
		System.out.println("1.Doodling" + "\t\t\t\t" + "2.Line Drawing" + "\t\t\t" + "3. Cartoon Style" + "\t\t\t" + "4.Photorealism/Hyperrealism");
		System.out.println("5.Tattoo Drawing" + "\t\t\t" + "6. Architectural" + "\t\t" + "7. Typographic" + "\t\t\t\t" + "8.Geometric");
		System.out.println("9.Diagrammatic" + "\t\t\t\t" + "10.Anamorphic" + "\t\t\t" + "11.Stippling" + "\t\t\t\t" + "12.Hatching & Cross Hatching");
		System.out.println("13.Scumbling & Scribble Art" + "\t\t" + "14.Fashion" + "\t\t\t" + "15.Pointillism" + "\t\t\t\t" + "16.Perspective");
		System.out.println();
		return;
	}


}//Cheryl's Drawing Code
