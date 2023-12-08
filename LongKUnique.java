import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        int ans = kLongest(s,k);
        System.out.println(ans);
    }
    public static int kLongest(String s,int k){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length();j++){
                int temp = 0;
                String sub = s.substring(i,j+1);
                if(isKUnique(sub,k)){
                    temp = sub.length();
                }
                ans = Math.max(temp,ans);
            }
        }
        if(ans == Integer.MIN_VALUE || ans == 0){
            return -1;
        }
        return ans;
    }
    public static boolean isKUnique(String sub,int k){
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < sub.length(); i++){
            set.add(sub.charAt(i));
        }
        return set.size() == k;
    }
}
