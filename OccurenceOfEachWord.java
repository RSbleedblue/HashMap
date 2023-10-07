import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void occurrenceOfEachWord(String s) 
    {
        HashMap<String,Integer> map = new HashMap<>();
        String str[] = s.split(" ");
        for(String word: str){
            word = word.trim();
            if(word.isEmpty()){
                continue;
            }
            if(map.containsKey(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
            else{
                map.put(word, 1);
            }
        }
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
