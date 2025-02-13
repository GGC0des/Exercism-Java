import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
      return languages.isEmpty();
    }

    public void addLanguage(String language) {
      languages.add(language);
      System.out.println(languages);
    }

    public void removeLanguage(String language) {
      languages.remove(language);
      System.out.println(language + " has been removed from your List.");
    }

    public String firstLanguage() {
      if (languages.isEmpty()) {
        throw new IllegalStateException("The list of languages is empty!");
      }
      return languages.get(0);
    }

    public int count() {
      return languages.size();
      // alternatively using a for loop
      //  int count = 0;
      //  for (String language : languages) {
      //      count++;
      //  }
    }

    public boolean containsLanguage(String language) {
      return languages.contains(language);
    }

    public boolean isExciting() {
      return (containsLanguage("Java") || containsLanguage("Kotlin")); // containsLanguage method is part of LanguageList class, not part of the List class. Needs to be called directly without prefixing it with List object languages
    }
}
