import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int even=0;
	    int odd=0;
	    for(int i=0;i<10;i++){
	        int n = sc.nextInt();
	        if(n%2==0){
	            even+=n;
	        }
	        else{
	            odd+=n;
	        }
	    }
	    System.out.println("even "+even);
	    System.out.println("odd "+odd);
	}
}
