import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static boolean anagram(String s1,String s2){
        
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] arr = s1.toCharArray();
	    char[] brr = s2.toCharArray();
	    
	    Arrays.sort(arr);
	    Arrays.sort(brr);
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]!=brr[i]){
	            return false;
	        }
	    }
	    return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s1=sc.next();
	    String s2= sc.next();
	    if(anagram(s1,s2)){
	        System.out.println("Anagram");
	    }
	    else{
	        System.out.println("Not Anagram");
	    }
	}
}
