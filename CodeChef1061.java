import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef1061 {
    /* package codechef; // don't place package name! */
    /* Name of the class has to be "Main" only if the class is public. */
        private static int check(int arr[],int size){
            int party = 0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int num:arr){
                if(map.containsKey(num)){
                    continue;
                }
                else{
                    map.put(num,1);
                }
            }
            return map.size();
        }
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int testCase = sc.nextInt();
            for(int i=0;i<testCase;i++){
                int totalFriends = sc.nextInt();
                int arr[] = new int[totalFriends];
                for(int j =0;j<totalFriends;j++){
                    arr[j] = sc.nextInt();
                }
                int result = check(arr,totalFriends);
                System.out.println(result);

            }
        }
    }

