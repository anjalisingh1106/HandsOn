import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String s = s1.charAt(0)+"";
		if(s2.contains(s)){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
		
	}
}
