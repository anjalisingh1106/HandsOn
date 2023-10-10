import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotRepeated {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1,2,3,2,3,4,7,8};
	   HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
	           map.put(arr[i],1);
	       }
	       else{
	           map.put(arr[i],map.get(arr[i])+1);
	       }
       }
	   for(Map.Entry<Integer,Integer> m : map.entrySet()){
	       if(m.getValue()==1){
	           System.out.print(m.getKey()+" ");
	       }
	   }
	}
}
