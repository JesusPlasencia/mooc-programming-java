
import java.util.ArrayList;

public class WordSet {

    private ArrayList<String> words;
    
    public WordSet () {
        this.words = new ArrayList<String>();
    }
    
    public void add (String word) {
        this.words.add(word);
    }
    
    public boolean contains (String word) {
        return this.words.contains(word);
    }
    
    public int palindromes () {
        int count = 0;
        
        for (String word : this.words) {
            if (isPalindrome(word)) {
                count ++;
            }
        }
        return count;
    }
    
    public boolean isPalindrome (String word) {
        
        int length = word.length();
        int end = length - 1;
        
        int i = 0;
        while (i < length / 2) {
            if (word.charAt(i) != word.charAt(end - i)) {
                return false;
            }
        }
        
        return true;
    }
    
}
