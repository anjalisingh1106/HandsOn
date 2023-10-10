import java.util.Arrays;
import java.util.Scanner;

public class LetterAsc {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    String res="";
	    char[] c = s.toCharArray();
	    Arrays.sort(c);
	    for(int i=0;i<c.length;i++){
	        res+=c[i];
	    }
	    System.out.println(res);
	}
}
