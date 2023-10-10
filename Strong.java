import java.util.Scanner;

public class Strong {
    static int factorial(int n){
        int f=1;
        for(int i=n;i>1;i--){
            f*=i;
        }
        return f;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0){
		    sum+=factorial(n%10);
		    n/=10;
		}
		if(sum==temp){
		    System.out.println("Strong number");
		}
		else{
		    System.out.println("Not a strong number");
		}
	}
}
