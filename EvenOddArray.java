import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   int[] arr = new int[]{1,3,2,4,5,7};
	   ArrayList<Integer> odd = new ArrayList<>();
	   ArrayList<Integer> even = new ArrayList<>();
	   for(int i=0;i<arr.length;i++){
	       if(arr[i]%2==0){
	           even.add(arr[i]);
	       }
	       else{
	           odd.add(arr[i]);
	       }
	   }
	   System.out.println(even);
	   System.out.println(odd);
	   
	}
}
