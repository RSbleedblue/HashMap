import java.util.HashMap;

public class NBaseRotation {
    private static String dectoNBase(int key){
        HashMap<Integer,Character> map = new HashMap<>();
        map.put(0,'0');map.put(1,'1');map.put(2,'2');map.put(3,'3');map.put(4,'4');
        map.put(5,'5');map.put(6,'6');map.put(7,'7');map.put(8,'8');map.put(9,'9');
        map.put(14,'E');map.put(13,'D');map.put(12,'C');map.put(11,'B');map.put(10,'A');
        map.put(15,'F');map.put(16,'G');map.put(17,'H');map.put(18,'I');map.put(19,'J');
        map.put(24,'O');map.put(23,'N');map.put(22,'M');map.put(21,'L');map.put(20,'K');
        map.put(25,'P');map.put(26,'Q');map.put(27,'R');map.put(28,'S');map.put(29,'T');
        map.put(34,'Y');map.put(33,'X');map.put(32,'W');map.put(31,'V');map.put(30,'U');
        map.put(35,'Z');
        StringBuilder sb = new StringBuilder();
        if(map.containsKey(key)){
            sb.append(map.get(key));
            return sb.toString();
        }
        return "";
    }
    private static String n_Base(int n,int num){
        StringBuilder sb = new StringBuilder();
        while(num>0){
            int rem = num%n;
            String temp = dectoNBase(rem);
            sb.append(temp);
            num = num/n;
        }
        String result = sb.reverse().toString();
        return result;
    }
    public static void main(String args[]){
        int N = 21;
        int num = 5678;
        String result = n_Base(N,num);
        System.out.println(result);
    }
}
