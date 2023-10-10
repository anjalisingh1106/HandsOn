import java.util.Arrays;
import java.util.Scanner;

public class CheckChar {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n =s.length();
		String first="";
		String last = "";
		first+=s.charAt(0);
		first+=s.charAt(1);
		last+=s.charAt(n-1);
		last+=s.charAt(n-2);
	    char[] arr = first.toCharArray();
	    char[] brr = last.toCharArray();
	    Arrays.sort(arr);
	    Arrays.sort(brr);
	    if(arr[0]==brr[0] && arr[1]==brr[1]){
	        System.out.println("Present");
	    }
	    else{
	        System.out.println("Not Present");
	    }
	}
}
