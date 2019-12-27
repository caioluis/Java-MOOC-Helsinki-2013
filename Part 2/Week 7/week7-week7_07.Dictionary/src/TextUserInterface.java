
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
public class TextUserInterface {

    private Scanner s;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.dictionary = dictionary;
        this.s = reader;
    }

    public void start() {
        while (true) {
            System.out.println("Statement: \n");
            System.out.println("    quit - quit the text user interface");

            String command = s.nextLine();

            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                if (command.equals("add")) {
                    System.out.println("In Finnish: ");
                    String word = s.nextLine();
                    System.out.println("Translation: ");
                    String transl = s.nextLine();

                    dictionary.add(word, transl);
                }

                if (command.equals("translate")) {
                    System.out.println("Give a word: ");
                    System.out.println("Translation: " + dictionary.translate(s.nextLine()));
                }

                System.out.println("Unknown statement\n");
            }
        }

    }
}
