package dictionary;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private String fileName;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) throws Exception {
        this.dictionary = new HashMap<>();
        this.fileName = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(this.fileName)).forEach(line -> {
                String[] parts = line.split(":");
                String key = parts[0];
                String value = parts[1];
                add(key, value);
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.fileName);
            for (String key : this.dictionary.keySet()) {
                String value = this.dictionary.get(key);
                writer.println(key + ":" + value);
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public void add(String words, String translation) {
        if (this.dictionary.containsKey(words)) {
            return;
        }
        this.dictionary.put(words, translation);
    }

    public String translate(String word) {
        for (String key : this.dictionary.keySet()) {
            String value = this.dictionary.get(key);
            if (key.equals(word)) {
                return value;
            }
            if (value.equals(word)) {
                return key;
            }
        }

        return null;
    }

    public void delete(String word) {
        for (String key : this.dictionary.keySet()) {
            String value = this.dictionary.get(key);
            if (key.equals(word) || value.equals(word)) {
                this.dictionary.remove(key);
                break;
            }
        }
    }
}
