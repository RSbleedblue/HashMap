/*
You are tasked with developing an employee management system for a company. 
To efficiently store employee data, you decide to use a HashMap>. In this HashMap, the keys represent unique employee IDs, 
and the values are ArrayLists of employee details as strings, including the employee's name, job title, and department.

you will be getting T queries which includes:

case-1 (add) -> add employee with details.
case-2 (update) -> update job title of a given employee.
case-3 (delete) -> remove the employee.
case-4 (show) -> print details of a given employee else print -1.

*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        int query = sc.nextInt();
        for(int i = 0; i < query; i++){
            String str = sc.next();
            if(str.equals("add")){
                String id = sc.next();
                String eName = sc.next();
                String eTitle = sc.next();
                String dep = sc.next();
                
                ArrayList<String> list = new ArrayList<>();
                list.add(eName);
                list.add(eTitle);
                list.add(dep);
                
                map.put(id,list);
            }
            else if(str.equals("update")){
                String id = sc.next();
                String eTitle = sc.next();
                map.get(id).set(1,eTitle);
            }
            else if(str.equals("delete")){
                String id = sc.next();
                map.remove(id);
            }
            else if(str.equals("show")){
                String id = sc.next();
                if(map.containsKey(id)){
                    ArrayList<String> temp = map.get(id);
                    for(String word: temp){
                        System.out.print(word+" ");
                    }
                }
                else{
                    System.out.print(-1);
                }
                System.out.println();
            }
        }
    }
}
