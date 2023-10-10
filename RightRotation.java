import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int[] a = new int[]{1,2,3,4,5};
	    int temp = a[0];
	    for(int i=1;i<a.length;i++){
	        a[i-1]=a[i];
	    }
	    a[a.length - 1]=temp;
	    for(int i=0;i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	}
}
