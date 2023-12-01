import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int arr[] = new int[s1];
        for(int i = 0; i < s1; i++){
            arr[i] = sc.nextInt();
        }
        int s2 = sc.nextInt();
        int arr2[] = new int[s2];
        for(int i = 0; i < s2; i++){
            arr2[i] = sc.nextInt();
        }
        int res = unionOfTwo(arr,s1,arr2,s2);
        System.out.println(res);
    } 
    public static int unionOfTwo(int arr[],int n,int arr2[],int m){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int num: arr2){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        return map.size();
    }
}
