import java.util.Scanner;

public class SmallestSum {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = new int[]{3, -4, 2, -3, -1, 7, -5};
	    int e = Integer.MAX_VALUE;
	    int f=Integer.MAX_VALUE;
	    for(int i=0;i<arr.length;i++){
	        if(e>0){
	            e=arr[i];
	        }
	        else{
	            e+=arr[i];
	        }
	        f=Math.min(e,f);
	    }
	    System.out.print(f);
		
	}
}
