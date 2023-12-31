import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	    HashMap<Character,Integer> map = new HashMap<>();
	    for(int i=0;i<s.length();i++){
	        if(!map.containsKey(s.charAt(i))){
	            map.put(s.charAt(i),1);
	        }
	        else{
	            map.put(s.charAt(i),map.get(s.charAt(i))+1);
	        }
	    }
	    for(Map.Entry<Character,Integer> m : map.entrySet()){
	        if(m.getValue()>1){
	            System.out.print(m.getKey());
	        }
	    }
	}
}
