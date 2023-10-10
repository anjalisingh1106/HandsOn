import java.util.Scanner;

public class PrintArmstrong {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		for(int i=n;i<=m;i++){
		int temp=i;
		int sum=0;
		while(i>0){
		    int k=i%10;
		    sum+=(k*k*k);
		    i/=10;
		}
		i=temp;
		if(sum==temp){
		    System.out.println(temp);
		}
		}
	}
}
