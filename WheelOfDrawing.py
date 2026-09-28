import random

def main():
print("Welcome to Drawing Ideas 3000")
print()

```
wanna_play_a_game = get_yes_or_no("Would you like an idea (Y/N): ")

while wanna_play_a_game == "Y":
    give_an_idea()
    print()
    wanna_play_a_game = get_yes_or_no(
        "Would you like a different idea (Y/N): "
    )

print("Thank you for your time. Have a good day!")
```

def get_yes_or_no(prompt):
while True:
answer = input(prompt).strip().upper()

```
    if answer == "Y" or answer == "N":
        return answer
    else:
        print("Please enter Y or N.")
```

def give_an_idea():
option_table()

```
understand_type = get_yes_or_no(
    "Would you like to know more about what each one is (Y/N): "
)

if understand_type == "Y":
    example_page()

chosen_type = pick_a_type()
display_idea(chosen_type)
```

def example_page():
print()
print("Go to the following link to learn more about each type:")
print("https://www.whataportrait.com/blog/types-of-drawing-styles/")
print()
option_table()

def pick_a_type():
while True:
print("Which type would you like (1-16): ", end="")
user_input = input().strip()

```
    try:
        chosen_type = int(user_input)

        if 1 <= chosen_type <= 16:
            return chosen_type
        else:
            print("Please enter a number from 1 through 16.")

    except ValueError:
        print("Please enter a whole number.")
```

def display_idea(chosen_type):
if chosen_type == 1 or chosen_type == 5:
print_random_idea(all_the_choices())

```
elif chosen_type == 2:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 3:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 4:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 6:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 7:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 8:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 9:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 10:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 11:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 12:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 13:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 14:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 15:
    print_random_idea(create_single_idea_list("apple"))

elif chosen_type == 16:
    print_random_idea(create_single_idea_list("apple"))

else:
    print("That drawing type is unavailable.")
```

def create_single_idea_list(idea):
ideas = []
ideas.append(idea)
return ideas

def print_random_idea(ideas):
random_index = random.randrange(len(ideas))
random_word = ideas[random_index]
print("What about drawing: " + random_word)

def all_the_choices():
tattoo = [
"logos",
"Locations",
"Buildings",
"Vehicles [i.e cars, trucks, boats, trains]",
"Kitchen Tools [i.e cups, bowls, tables]",
"Kitchen Tool with faces",
"Word Art",
"Weapons",
"Animals [on things]",
"real and not real Animals",
"Pattern Art w/ Words",
"Pattern Art",
"Eyes",
"People",
"Fish",
"Movie related things [i.e Alice in Wonderland]",
"DNA w/ things",
"lava lamp",
"MythoGraphic",
"Flowers",
"Feathers",
"Mushroom House",
"Candle",
"Optical Illusions",
"Free hand Drawing",
"Cartoon Characters [i.e Simpsons, Family Guy]"
]

```
return tattoo
```

def option_table():
print("Drawing Ideas Choices/Types")
print(
"1. Doodling\t\t\t2. Line Drawing\t\t3. Cartoon Style\t\t"
"4. Photorealism/Hyperrealism"
)
print(
"5. Tattoo Drawing\t\t6. Architectural\t\t7. Typographic\t\t"
"8. Geometric"
)
print(
"9. Diagrammatic\t\t10. Anamorphic\t\t11. Stippling\t\t\t"
"12. Hatching & Cross Hatching"
)
print(
"13. Scumbling & Scribble Art\t14. Fashion\t\t15. Pointillism\t\t"
"16. Perspective"
)
print()

if **name** == "**main**":
main()
