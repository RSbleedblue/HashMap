import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int ans = longestCon(arr,size);
        System.out.println(ans);
    }
    public static int longestCon(int arr[],int n){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int maxVal = Integer.MIN_VALUE;
        for(int num:arr){
            if(!set.contains(num-1)){
                int cVal = num;
                int temp = 1;
                while(set.contains(cVal + 1)){
                    temp++;
                    cVal +=1;
                }
                maxVal = Math.max(temp,maxVal);
            }
            
        }
        return maxVal;
    }
}
