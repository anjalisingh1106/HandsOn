import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DigitAsc {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    ArrayList<Integer> l = new ArrayList<>();
	    while(n>0){
	        l.add(n%10);
	        n/=10;
	    }
	    Collections.sort(l);
	    String str ="";
	    for(int i=0;i<l.size();i++){
	        str+=l.get(i);
	    }
	    int res=Integer.parseInt(str);
	    System.out.println(res);
	}
}
