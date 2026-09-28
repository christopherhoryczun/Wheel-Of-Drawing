#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>
#include <time.h>

void optionTable();
void examplePage();
void giveAnIdea();
void getYesOrNo(char prompt[], char answer[]);
int pickAType();
void displayIdea(int chosenType);
void createSingleIdeaList(char idea[], char ideas[][100], int *size);
void printRandomIdea(char ideas[][100], int size);
int allTheChoices(char ideas[][100]);

int main()
{
char wannaPlayAGame[10];

```
srand(time(NULL));

printf("Welcome to Drawing Ideas 3000\n");
printf("\n");

getYesOrNo("Would you like an idea (Y/N): ", wannaPlayAGame);

while (strcmp(wannaPlayAGame, "Y") == 0)
{
    giveAnIdea();

    printf("\n");

    getYesOrNo(
        "Would you like a different idea (Y/N): ",
        wannaPlayAGame
    );
}

printf("Thank you for your time. Have a good day!\n");

return 0;
```

}

void getYesOrNo(char prompt[], char answer[])
{
do
{
printf("%s", prompt);
scanf("%9s", answer);

```
    answer[0] = toupper(answer[0]);
    answer[1] = '\0';

    if (strcmp(answer, "Y") != 0 &&
        strcmp(answer, "N") != 0)
    {
        printf("Please enter Y or N.\n");
    }

} while (strcmp(answer, "Y") != 0 &&
         strcmp(answer, "N") != 0);
```

}

void giveAnIdea()
{
char understandType[10];

```
optionTable();

getYesOrNo(
    "Would you like to know more about what each one is (Y/N): ",
    understandType
);

if (strcmp(understandType, "Y") == 0)
{
    examplePage();
}

int chosenType = pickAType();

displayIdea(chosenType);
```

}

void examplePage()
{
printf("\n");
printf("Go to the following link to learn more about each type:\n");
printf("https://www.whataportrait.com/blog/types-of-drawing-styles/\n");
printf("\n");

```
optionTable();
```

}

int pickAType()
{
int chosenType;

```
while (1)
{
    printf("Which type would you like (1-16): ");

    if (scanf("%d", &chosenType) != 1)
    {
        printf("Please enter a whole number.\n");

        while (getchar() != '\n')
        {
            // Clear invalid input
        }

        continue;
    }

    if (chosenType >= 1 && chosenType <= 16)
    {
        return chosenType;
    }
    else
    {
        printf("Please enter a number from 1 through 16.\n");
    }
}
```

}

void displayIdea(int chosenType)
{
char ideas[100][100];
int size = 0;

```
if (chosenType == 1 || chosenType == 5)
{
    size = allTheChoices(ideas);
    printRandomIdea(ideas, size);
}
else if (chosenType >= 2 && chosenType <= 16)
{
    createSingleIdeaList("apple", ideas, &size);
    printRandomIdea(ideas, size);
}
else
{
    printf("That drawing type is unavailable.\n");
}
```

}

void createSingleIdeaList(
char idea[],
char ideas[][100],
int *size
)
{
strcpy(ideas[0], idea);
*size = 1;
}

void printRandomIdea(char ideas[][100], int size)
{
int randomIndex = rand() % size;

```
printf(
    "What about drawing: %s\n",
    ideas[randomIndex]
);
```

}

int allTheChoices(char ideas[][100])
{
strcpy(ideas[0], "logos");
strcpy(ideas[1], "Locations");
strcpy(ideas[2], "Buildings");
strcpy(ideas[3], "Vehicles [i.e cars, trucks, boats, trains]");
strcpy(ideas[4], "Kitchen Tools [i.e cups, bowls, tables]");
strcpy(ideas[5], "Kitchen Tool with faces");
strcpy(ideas[6], "Word Art");
strcpy(ideas[7], "Weapons");
strcpy(ideas[8], "Animals [on things]");
strcpy(ideas[9], "real and not real Animals");
strcpy(ideas[10], "Pattern Art w/ Words");
strcpy(ideas[11], "Pattern Art");
strcpy(ideas[12], "Eyes");
strcpy(ideas[13], "People");
strcpy(ideas[14], "Fish");
strcpy(ideas[15], "Movie related things [i.e Alice in Wonderland]");
strcpy(ideas[16], "DNA w/ things");
strcpy(ideas[17], "lava lamp");
strcpy(ideas[18], "MythoGraphic");
strcpy(ideas[19], "Flowers");
strcpy(ideas[20], "Feathers");
strcpy(ideas[21], "Mushroom House");
strcpy(ideas[22], "Candle");
strcpy(ideas[23], "Optical Illusions");
strcpy(ideas[24], "Free hand Drawing");
strcpy(ideas[25], "Cartoon Characters [i.e Simpsons, Family Guy]");

```
return 26;
```

}

void optionTable()
{
printf("Drawing Ideas Choices/Types\n");

```
printf(
    "1. Doodling\t\t\t"
    "2. Line Drawing\t\t"
    "3. Cartoon Style\t\t"
    "4. Photorealism/Hyperrealism\n"
);

printf(
    "5. Tattoo Drawing\t\t"
    "6. Architectural\t\t"
    "7. Typographic\t\t"
    "8. Geometric\n"
);

printf(
    "9. Diagrammatic\t\t"
    "10. Anamorphic\t\t"
    "11. Stippling\t\t\t"
    "12. Hatching & Cross Hatching\n"
);

printf(
    "13. Scumbling & Scribble Art\t"
    "14. Fashion\t\t"
    "15. Pointillism\t\t"
    "16. Perspective\n"
);

printf("\n");
```

}
