import java.util.*;
class WordCountttt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words = text.trim().split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            if (wordCountMap.containsKey(lowercaseWord)) 
            {
                int count = wordCountMap.get(lowercaseWord);
                wordCountMap.put(lowercaseWord, count + 1);
            } 
            else 
            {
                wordCountMap.put(lowercaseWord, 1);
            }
        }
        
        System.out.println("Word Count:");
        for (String word : wordCountMap.keySet()) 
        {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
