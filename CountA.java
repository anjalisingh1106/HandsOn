import java.util.Scanner;

public class CountA {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s= sc.nextLine();
	    int count=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)=='a'){
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
