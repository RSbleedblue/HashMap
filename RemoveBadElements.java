/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static int check(int arr[],int size){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int maxCount = 0;
        for(int count:map.values()){
            maxCount = Math.max(count,maxCount);
        }
        int operations = size-maxCount;
        return operations;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0;i<testCase;i++){
            int size = sc.nextInt();
            int arr[] = new int[size];
            for(int j = 0; j<size ; j++){
                arr[j] = sc.nextInt();
            }
            int result = check(arr,size);
            System.out.println(result);
        }
    }
}
