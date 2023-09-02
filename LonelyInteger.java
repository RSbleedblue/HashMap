import java.util.*;
public class LonelyInteger {
    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<a.size();i++){
            int currentElement = a.get(i);
            if(map.containsKey(currentElement)){
                map.put(currentElement,map.getOrDefault(currentElement,0)+1);
            }
            else{
                map.put(currentElement,1);
            }
        }
        int ans = 0;
        for(int i =0;i<a.size();i++){
            if(map.get(a.get(i))==1){
                ans=a.get(i);
            }
        }
        return ans;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(3);
        int result = lonelyinteger(list);
        System.out.println(result);


    }
}
