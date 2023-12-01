/*
Given an array nums of size n, return the majority element. Note : The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.
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
        int ans = majorityEle(arr,size);
        System.out.println(ans);
    }
    public static int majorityEle(int arr[],int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int bar = n/2;
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int val = e.getValue();
            int key = e.getKey();
            if(val > bar){
                return key;
            }
        }
        return -1;
    }
}
