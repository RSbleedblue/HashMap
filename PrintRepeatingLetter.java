import java.util.HashMap;
import java.util.Map;

public class StringCountPrintLetter {
    private  static String result(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char currentChar = str.charAt(i);
            if(map.containsKey(currentChar)){
                continue;
            }
            else{
                if(i+1 <str.length() && Character.isLetter(currentChar)){
                    int value =(int)(str.charAt(i+1)) - '0';
                    map.put(currentChar,value);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int value = entry.getValue();
            int i = 0;
            while(i<value){
                sb.append(entry.getKey());
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "A3B7C2A3";
        String result = result(str);
        System.out.println(result);
    }
}
