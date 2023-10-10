import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    float n=0;
	    for(int i=0;i<10;i++){
	        n+=sc.nextInt();
	    }
	    System.out.println(n/10);
	}
}
