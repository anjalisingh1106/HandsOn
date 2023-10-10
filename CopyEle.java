import java.util.Scanner;

public class CopyEle {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] arr = new int[]{2,4,1,7,3,5,8};
	    int[] brr = new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        brr[i]=arr[i];
	    }
	    for(int i=0;i<brr.length;i++){
	        System.out.print(brr[i]+" ");
	    }
	}
}
