import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = longSub(str);
        System.out.println(res);
    }
    public static int longSub(String str){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < str.length();i++){
            for(int j = i; j < str.length(); j++){
                String subStr = str.substring(i,j);
                if(isValid(subStr)){
                    int len = subStr.length();
                    ans = Math.max(len,ans);
                }
            }
        }
        return ans;
    }
    public static boolean isValid(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e: map.entrySet()){
            int val = e.getValue();
            if(val > 1){
                return false;
            }
        }
        return true;
    }
}
