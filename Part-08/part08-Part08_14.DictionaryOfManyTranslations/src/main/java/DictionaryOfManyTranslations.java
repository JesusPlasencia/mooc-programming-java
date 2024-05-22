
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations () {
        this.dictionary = new HashMap<>();
    }
    
    public void add (String word, String definition) {
        // Dont exist the word in the dictionary, and we create the list (using putIfAbsent)
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        // Option 1: Add with get
        // this.dictionary.get(word).add(word);
        
        // Option 2: Getting the reference or pointer and then adding
        ArrayList<String> listOfTranslations = this.dictionary.get(word);
        listOfTranslations.add(definition);
    }
 
    public ArrayList<String> translate(String word) {
        // No word in dictionary
        if (!this.dictionary.containsKey(word)) {
            return new ArrayList<>();
        }
        
        ArrayList<String> list = this.dictionary.get(word);
        return list;
    }
    
    public void remove (String word) {
        if (!this.dictionary.containsKey(word)) {
            return;
        }
        this.dictionary.remove(word);
    }
}
