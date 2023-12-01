/*
Take an integer N as input from user, then take N characters as input. And print the Frequency of Each Character.
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char[] arr = new char[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.next().charAt(0);
        }
        charFreq(arr,size);
    }
    public static void charFreq(char arr[],int size){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        Arrays.sort(arr);
        for(char c: arr){
            if(map.containsKey(c)){
                System.out.print(c+" ");
                System.out.println(map.get(c));
            }
            map.remove(c);
        }
    }
}
