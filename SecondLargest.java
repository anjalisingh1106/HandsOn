import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = new int[5];
	    for(int i=0;i<5;i++){
	        arr[i]=sc.nextInt();
	    }
	    int max=Integer.MIN_VALUE;
	    int second = max;
	    for(int i=0;i<5;i++){
	        if(max<arr[i]){
	            second=max;
	            max=arr[i];
	        }
	        if(second<arr[i] && arr[i]!=max){
	            second=arr[i];
	        }
	    }
	    System.out.println(second);
	}
}
