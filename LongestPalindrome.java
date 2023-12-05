import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = longestPalindrome(str);
        System.out.println(length);
    }
    public static int longestPalindrome(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        int ans = 0;
        boolean oddTrue = false;
        for(int num : map.values()){
            if(num % 2 == 0){
                ans += num;
            }
            else{
                ans += num-1;
                oddTrue = true;
            }
        }
        if(oddTrue){
            ans += 1;
        }
        return ans;
    }
}
