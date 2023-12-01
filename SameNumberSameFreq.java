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
        sameNumberFreq(arr);
    }
    public static void sameNumberFreq(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            int abs = Math.abs(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int abs = Math.abs(arr[i]);
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                if(val == abs){
                    list.add(arr[i]);
                }
            }
            map.remove(arr[i]);
        }
        Collections.sort(list);
        for(int num : list){
            System.out.println(num);
        }
    }
}
