import java.util.Arrays;
import java.util.Scanner;

public class CheckArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = new int[5];
	    int[] brr = new int[5];
	    for(int i=0;i<5;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<5;i++){
	        brr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    Arrays.sort(brr);
	    int f=0;
	    for(int i=0;i<5;i++){
	        if(arr[i]!=brr[i]){
	            f=1;
	            break;
	        }
	    }
	    
	    if(f==0){
	        System.out.println("Same");
	    }
	    else{
	        System.out.println("Not same");
	    }
	}
}
