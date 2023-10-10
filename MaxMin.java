import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int[] arr = new int[]{3,2,55,4,98,1,7,87};
	   int min=Integer.MAX_VALUE;
	   int max=Integer.MIN_VALUE;
	   for(int i=0;i<arr.length;i++){
	       if(min>arr[i]){
	           min=arr[i];
	       }
	       if(max<arr[i]){
	           max=arr[i];
	       }
	   }
	   System.out.println("max - "+ max);
	   System.out.println("min - "+min);
	}
}
