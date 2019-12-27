
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Caio
 */
public class Dictionary {

   private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (dictionary.containsKey(word)) {
            return dictionary.getOrDefault(word, word);
        }
        return null;
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public int amountOfWords() {
        return dictionary.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList();
        for (String word : dictionary.keySet()) {
            translations.add(word + " = " + dictionary.get(word));
        }
        return translations;
    }
}
