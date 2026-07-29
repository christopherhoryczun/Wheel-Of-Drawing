//Packagesz
package personalProjects;

//Imports
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WheelOfDrawing {

    //Private Static
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        String wannaPlayaGame;

        System.out.println("Welcome to Drawing Ideas 3000");
        System.out.println();

        wannaPlayaGame = getYesOrNo("Would you like an idea (Y/N): ");

        while (wannaPlayaGame.equals("Y")) {
            giveAnIdea();
            System.out.println();
            wannaPlayaGame = getYesOrNo("Would you like a different idea (Y/N): ");
        }

        System.out.println("Thank you for your time. Have a good day!");
        scanner.close();
    }

    private static void giveAnIdea() {
        optionTable();

        String understandType = getYesOrNo(
                "Would you like to know more about what each one is (Y/N): ");

        if (understandType.equals("Y")) {
            examplePage();
        }

        int chosenType = pickAType();
        displayIdea(chosenType);
    }

    private static String getYesOrNo(String prompt) {
        String answer;

        do {
            System.out.print(prompt);
            answer = scanner.nextLine().trim().toUpperCase();

            if (!answer.equals("Y") && !answer.equals("N")) {
                System.out.println("Please enter Y or N.");
            }
        } while (!answer.equals("Y") && !answer.equals("N"));

        return answer;
    }

    private static void examplePage() {
        System.out.println();
        System.out.println("Go to the following link to learn more about each type:");
        System.out.println("https://www.whataportrait.com/blog/types-of-drawing-styles/");
        System.out.println();
        optionTable();
    }

    private static int pickAType() {
        int chosenType = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Which type would you like (1-16): ");
            String input = scanner.nextLine().trim();

            try {
                chosenType = Integer.parseInt(input);

                if (chosenType >= 1 && chosenType <= 16) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a number from 1 through 16.");
                }
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a whole number.");
            }
        }

        return chosenType;
    }

    private static void displayIdea(int chosenType) {
        switch (chosenType) {
            case 1:
            case 5:
                printRandomIdea(allTheChoices());
                break;
            case 2:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 3:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 4:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 6:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 7:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 8:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 9:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 10:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 11:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 12:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 13:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 14:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 15:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            case 16:
                printRandomIdea(createSingleIdeaList("apple"));
                break;
            default:
                System.out.println("That drawing type is unavailable.");
        }
    }

    private static List<String> createSingleIdeaList(String idea) {
        List<String> ideas = new ArrayList<>();
        ideas.add(idea);
        return ideas;
    }

    private static void printRandomIdea(List<String> ideas) {
        int randomIndex = random.nextInt(ideas.size());
        String randomWord = ideas.get(randomIndex);
        System.out.println("What about drawing: " + randomWord);
    }

    private static List<String> allTheChoices() {
        List<String> tattoo = new ArrayList<>();
        tattoo.add("logos");
        tattoo.add("Locations");
        tattoo.add("Buildings");
        tattoo.add("Vehicles [i.e cars, trucks, boats, trains]");
        tattoo.add("Kitchen Tools [i.e cups, bowls, tables]");
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
        tattoo.add("Movie related things [i.e Alice in Wonderland]");
        tattoo.add("DNA w/ things");
        tattoo.add("lava lamp");
        tattoo.add("MythoGraphic");
        tattoo.add("Flowers");
        tattoo.add("Feathers");
        tattoo.add("Mushroom House");
        tattoo.add("Candle");
        tattoo.add("Optical Illusions");
        tattoo.add("Free hand Drawing");
        tattoo.add("Cartoon Characters [i.e Simpsons, Family Guy]");
        return tattoo;
    }

    private static void optionTable() {
        System.out.println("Drawing Ideas Choices/Types");
        System.out.println("1. Doodling\t\t\t2. Line Drawing\t\t3. Cartoon Style\t\t4. Photorealism/Hyperrealism");
        System.out.println("5. Tattoo Drawing\t\t6. Architectural\t\t7. Typographic\t\t8. Geometric");
        System.out.println("9. Diagrammatic\t\t10. Anamorphic\t\t11. Stippling\t\t\t12. Hatching & Cross Hatching");
        System.out.println("13. Scumbling & Scribble Art\t14. Fashion\t\t15. Pointillism\t\t16. Perspective");
        System.out.println();
    }
}
