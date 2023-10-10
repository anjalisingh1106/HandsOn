import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0){
		    int k=n%10;
		    sum+=(k*k*k);
		    n/=10;
		}
		if(sum==temp){
		    System.out.println("Armstrong number");
		}
		else{
		    System.out.println("Not a Armstrong number");
		}
	}
}
