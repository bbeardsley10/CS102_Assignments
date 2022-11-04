//package Assignment06;
//testing
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mainClass {

  public static void main(String[] args) throws Exception{

    File file = new File("happy.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));
    Set<String> uniqueWords = new HashSet<String>();
    Map<String, Integer> numOfOccurrences = new HashMap<>();
    String textLine = br.readLine();


  while(textLine != null){

    if(!textLine.trim().equals("")) {
      String [] words = textLine.split(" ");

      for(String word : words){
        if(word == null || word.trim().equals("")){
          continue;
        }
        String processed = word.toLowerCase()
                .replace(",", "")
                .replace("(", "")
                .replace(")", "");

        if(numOfOccurrences.containsKey(processed)){
          numOfOccurrences.put(processed, numOfOccurrences.get(processed) + 1);
        } else {
          numOfOccurrences.put(processed, 1);
        }
        String cleanUpWord = word.toLowerCase()
                  .replace(",", "")
                  .replace("(", "")
                  .replace(")", "");
          uniqueWords.add(cleanUpWord);
      }

    }
    textLine = br.readLine();
  }
 

  System.out.println("Total Amount of Unique Words: " + uniqueWords.size());
  System.out.println();

  if(numOfOccurrences.containsKey("happy")){

    int value = numOfOccurrences.get("happy");
    System.out.println("Happy appears " + value + " times.");
  }
  }
}