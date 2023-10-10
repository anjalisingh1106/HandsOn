import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int[] arr = new int[]{1,23,45,3};
	   int[] brr = new int[]{32,645,7,4};
	   int[] c = new int[arr.length+brr.length];
	   int j=0;
	   for(int i=0;i<arr.length;i++){
	       c[j]=arr[i];
	       j++;
	   }
	   for(int i=0;i<brr.length;i++){
	       c[j]=brr[i];
	       j++;
	   }
	   for(int i=0;i<c.length;i++){
	       System.out.print(c[i]+" ");
	   }
	}
}
