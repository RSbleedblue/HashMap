/*
You are given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = uniqueCh(str);
        System.out.println(res);
    }
    public static int uniqueCh(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char cVal = str.charAt(i);
            if(map.containsKey(cVal)){
                map.put(cVal,map.get(cVal)+1);
            }
            else{
                map.put(cVal,1);
            }
        }
        for(int i = 0; i < str.length(); i++){
            char cVal = str.charAt(i);
            if(map.get(cVal) == 1){
                return i;
                
            }
        }
        return -1;
    }
}
