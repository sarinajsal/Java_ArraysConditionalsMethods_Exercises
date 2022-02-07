package exercises;

public class Exercise6 {


        /*
            Create a package called email
            Then have a method called validateEmail that return true of false if input is valid email
            Finally invoke validateEmail in main
                i.e. "hello@gmail.com" -> true
                i.e. "hellogmail.com" -> false
        */

    //create a method that will scan through a strings characters and search for an @ symbol
    //if there is an @ symbol, return true
    String string = new String("hello");
    public void emailConfirmation(String string){
        if(string.contains("@")){
            System.out.println(string + " is an email");
        }
        else{
            System.out.println(string + " not an email");
        }

    }

    }


