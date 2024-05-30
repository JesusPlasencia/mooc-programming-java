package dictionary;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws Exception {
        // You can test your dictionary here
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        dictionary.load();

        // use the dictionary
        dictionary.add("valas", "whale");
        dictionary.add("Jeesus", "jesus");
        dictionary.add("elämää", "life");
        dictionary.add("olut", "beer");
        dictionary.add("apina", "monkey");
        
        //apina:monkey
        //alla oleva:below
        //olut:beer 
        //
        dictionary.save();
    }

    public static void writeToFile(String fileName, String text) throws Exception {
        PrintWriter writer = new PrintWriter(fileName);
        writer.println(text);
        writer.close();
    }
}
