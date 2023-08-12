import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class SubarrayWith0 {
    public static ArrayList<ArrayList<Integer>> subArray(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        int sum = 0;

        ArrayList<Integer> zeroSumIndex = new ArrayList<>();
        zeroSumIndex.add(-1);
        map.put(0, zeroSumIndex);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                ArrayList<Integer> indices = map.get(sum);
                for (int index : indices) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(index + 1);
                    pair.add(i);
                    pairs.add(pair);
                }
                indices.add(i);
            } else {
                ArrayList<Integer> indices = new ArrayList<>();
                indices.add(i);
                map.put(sum, indices);
            }
        }

        return pairs;
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        ArrayList<ArrayList<Integer>> ans = subArray(arr);

        if (ans.isEmpty()) {
            System.out.println("Subarray with zero-sum does not exist.");
        } else {
            System.out.println("Subarrays with zero-sum exist:");
            for (ArrayList<Integer> pair : ans) {
                int start = pair.get(0);
                int end = pair.get(1);
                System.out.print("{ ");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println("}");
            }
        }
    }
}
