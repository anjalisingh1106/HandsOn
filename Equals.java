import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s=sc.next();
	    String n = sc.next();
	    System.out.println(s==n);
	    System.out.println(s.equals(n));
	}
}
