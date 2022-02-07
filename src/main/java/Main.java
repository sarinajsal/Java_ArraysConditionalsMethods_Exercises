import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
        String[] jkArray;
        jkArray = new String[]{"YOU!",
                "What do you call a fish wearing a bowtie? Sofishticated.",
                "I'm afraid for the calendar. Its days are numbered.",
                "Why don't eggs tell jokes? They'd crack each other up."};

//        Random randomNum = new Random();
//        int randomInt = randomNum.nextInt(jkArray.length);
//        System.out.println(randomInt);
//
//        for (int i = 0; i < jkArray.length; i++) {
//            i = randomInt;
//            System.out.println(jkArray[i].toString());
//            break;
//
//        }

//        first, create scanners that ask "want to hear a joke?"

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
