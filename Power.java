import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int p=sc.nextInt();
	    int ans=1;
	    for(int i=0;i<p;i++){
	        ans*=n;
	    }
	    System.out.println(ans);
	}
}
