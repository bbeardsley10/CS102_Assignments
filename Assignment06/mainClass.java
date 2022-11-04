package Assignment06;
//testing
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mainClass {

  static void wordCounter(){
    
    
  }
  public static void main(String[] args) throws Exception{

    File file = new File("happy.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));
    Set<String> uniqueWords = new HashSet<String>();
    Map<String, Integer> numOfOccurrences = new HashMap<>();
    String textLine = br.readLine();



  int totalWords = 0;
  while(textLine != null){

    if(!textLine.trim().equals("")) {
      String [] words = textLine.split(" ");

      //totalWords += words.length;
      for(String word : words){
        if(word == null || word.trim().equals("")){
          continue;
        }
        String processed = word.toLowerCase();

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

  int counter = 0;
  String theWord = "happy";

  for(String word1 : numOfOccurrences.keySet()){
    Integer value = numOfOccurrences.get(word1);
    if(value > counter){
      counter = value;
      theWord = word1;
    }
  }


 // System.out.println(textLine);
  System.out.println(numOfOccurrences);
  System.out.println();
  System.out.println(uniqueWords);
  System.out.println();
  System.out.println("Total Amount of Unique Words: " + uniqueWords.size());
  System.out.println();
  System.out.println("Total Amount of Words: " + totalWords);
  System.out.println();
  System.out.println("The most frequently used word: " + theWord + " " + counter);
  }
}
