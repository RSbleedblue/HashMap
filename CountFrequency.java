import java.util.ArrayList;
import java.util.HashMap;

public class CountingFrequency {
    public static ArrayList<ArrayList<Integer>> count(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        for (int num : map.keySet()) {
            ArrayList<Integer> pair = new ArrayList<>();
            pair.add(num);
            pair.add(map.get(num));
            ans.add(pair);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {10, 10, 20, 20, 20, 30, 30};
        ArrayList<ArrayList<Integer>> ans = count(arr);
        for (ArrayList<Integer> pair : ans) {
            System.out.println(pair.get(0) + " appears " + pair.get(1) + " times");
        }
    }
}
