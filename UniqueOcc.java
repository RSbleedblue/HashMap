/*
Take an array of integers arr as input from user and print "true" if the number of occurrences of each value in the array is unique, else print "false".
*/

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
        boolean res = uniqueNum(arr);
        System.out.println(res);
    }
    public static boolean uniqueNum(int arr[]){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            set.add(e.getValue());
        }
        return map.size() == set.size();
    }
}
