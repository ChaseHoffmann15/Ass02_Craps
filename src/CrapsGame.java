import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Random rnd = new Random(); // Create a Random object called rnd.
        Scanner in = new Scanner(System.in);

        int die1;
        int die2;
        int crapsRoll;
        boolean done = false;
        String play;
        String rollAgain;


        do {
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die1 + die2;



            if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12){
                System.out.println(crapsRoll);
                System.out.println("Crapping Out!!");
                System.out.println("You Lost");
            }else if(crapsRoll == 7 || crapsRoll == 11){
                System.out.println(crapsRoll);
                System.out.println("Natural!!");
                System.out.println("You Won");
            }else {

                do {
                    System.out.println(crapsRoll);
                    System.out.println("The Point!");

                    System.out.println("Enter yes to roll again");
                    rollAgain = in.next();
                    if (rollAgain.equalsIgnoreCase("yes")){
                        crapsRoll = rnd.nextInt(12) + 1;

                        if (crapsRoll == 7){
                            System.out.println("You Lost!");
                        }else{
                            done = true;
                        }

                    }else{
                        System.out.println("Invalid Answer");
                        in.nextLine();
                        done = true;

                    }

                }while(!done);


            }





            System.out.println();
            System.out.println("Would you like to restart?");
            play = in.next();
            in.nextLine();

            if(play.equalsIgnoreCase("yes")){
                done = false;
            }else if (play.equalsIgnoreCase("no")){
                done = true;
            }


        }while(!done);







    }
}
