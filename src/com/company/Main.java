package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int userChoice = 0;


        Scanner scan= new Scanner(System.in);


        System.out.println("Welcome to the Adventure Chooser. \n You wake up in a dark forest with no idea how you got there." +
                " What do you do? (Enter a number to select an option)");
        System.out.println("Press 1 - Start walking until you find something useful, like a road or another human.. \n Press 2 - Stay put and assess the situation.. \n Press 3 -  Find shelter and go back to sleep. No point doing anything until it’s light out and you can see your surroundings. \n Press 4 - Completely and utterly panic, run in circles, scream your head off, etc.");


        userChoice = scan.nextInt();


        if (userChoice == 1) {
            System.out.println("You found a road, which allowed you to get cell phone reception! You call a Lyft and head home.");
        }
        else if (userChoice == 2){

            System.out.println("You see a small cabin in the distance, you head that way to find help.");
        }
        else if (userChoice == 3){

            System.out.println("You wake up, and it's still dark out.... time for plan B");
        }
        else if (userChoice == 4){

            System.out.println("Your screaming wakes up a near by creepy monster. You are chased into the abyss by said thing....");
        } else {

           System.out.println("Not a valid option!");
        }




    }
}
