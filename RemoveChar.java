import java.util.ArrayList;
import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2 = sc.nextLine();
	    String res="";
	    ArrayList<Character> l = new ArrayList<>();
	    for(int i=0;i<s2.length();i++){
	        l.add(s2.charAt(i));
	    }
	    for(int i=0;i<s1.length();i++){
	        if(!l.contains(s1.charAt(i))){
	           res+=s1.charAt(i); 
	        }
	    }
	    System.out.println(res);
	}
}
