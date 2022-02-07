package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    public void jokes() throws Exception{

        String[] jkArray;
        jkArray = new String[]{"YOU!",
                "What do you call a fish wearing a bowtie? Sofishticated.",
                "I'm afraid for the calendar. Its days are numbered.",
                "Why don't eggs tell jokes? They'd crack each other up."};

        Boolean repeatJoke = true;

        while (repeatJoke) {

            Scanner jokeScanner = new Scanner(System.in);
            System.out.println("want to hear a joke?");
            String input = jokeScanner.nextLine();
            if (input.equals("yes")) {
                Random randomNum = new Random();
                int randomInt = randomNum.nextInt(jkArray.length);

                //i need to display a random string (from a joke string array?) and prnt

                for (int i = 0; i < jkArray.length; i++) {
                    i = randomInt;
                    System.out.println(jkArray[i].toString());
                    break;


                }
                repeatJoke = true;
            } else if (input.equals("no")) {
                repeatJoke = false;
                System.out.println("ok :(");
            }
            else throw new Exception("invalid");


        }



    }
}



