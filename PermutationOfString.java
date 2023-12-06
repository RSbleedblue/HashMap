import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean res = permute(s1,s2);
        System.out.println(res);
    }
    public static boolean permute(String s1,String s2){
        int n = s1.length();
        for(int i = 0; i <= s2.length()-n; i++){
            String subStr = s2.substring(i,i+n);
            if(checkPermute(s1,subStr)){
                return true;
            }
        }
        return false;
    }
    public static boolean checkPermute(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i = 0; i < s2.length(); i++){
            if(!map.containsKey(s2.charAt(i))){
                return false;
            }
            else{
                int value = map.get(s2.charAt(i));
                if(value == 0){
                    map.remove(s2.charAt(i));
                }
                else{
                    map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
                }
            }
        }
        return true;
    }
}
