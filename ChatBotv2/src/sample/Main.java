package sample;
import java.io.*;
import java.util.Scanner;

//@author arianneghislainerull

public class Main {
    // main method
    public static void main(String[] args) throws FileNotFoundException {
        // print to the user
        System.out.println("\f");
        //scanner to get the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World, let us chat with each other! \n What is your name?");
        System.out.println("Print here: ");
        // always define the type of the variable
        String n = sc.nextLine();
        System.out.println("Welcome, " + n + "! How are you? \n Press a number if you have a " +
                "question.");

        //while loop
        //loop then the condition
        while(true){
            System.out.println("Print here: ");
            String s = sc.nextLine();
            s = s.toUpperCase();

            //if statement (if then, condition)
            //index is used to search/look up the key words in quotation marks
            if (s.indexOf("FINE") >= 0){
                System.out.println("That's fantastic, " + n + "!");
            }else if (s.indexOf("HI") >= 0){
                System.out.println("Hello, " + n + " !");
            }else if (s.indexOf("NOT GOOD") >= 0){
                System.out.println("Too bad, I hope you feel better soon");
            }else{
                System.out.println("How may I help you?");
                System.out.println("Print here: ");
                String q = sc.nextLine();
                // this turns the word received into capital letters/uppercase letters
                q = s.toUpperCase();

                if (q.indexOf("EMAIL") >=0){
                    System.out.println("To contact TEAM Paradigm Shift 2198, please send your " +
                            "email to: brian.wong@tdsb.on.ca");
                } else if(q.indexOf("SCHOOL") >=0){
                    System.out.println("TEAM Paradigm Shift 2198 affiliated with LAmoreaux CI!");
                } else{
                    System.out.println("Sorry, I need to update my knowledge base.");
                    System.out.println("Please retype the question. Sorry for the inconvenience, " +
                            "we will be updating our knowledge base at the latest.");
                    //retyping the question to store it on a file
                    File file = new File("hello.txt");
                    String r = sc.nextLine();
                    r = s.toUpperCase();
                    System.out.println(r);
                    PrintWriter output = new PrintWriter( file );
                    output.close();

                }
            }
        }
    }
}
