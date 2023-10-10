import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
	    Scanner sc =new Scanner(System.in);
	   Integer[] n ={1,2,3,4,5};
	   List<Integer> l = Arrays.asList(n);
	   Collections.shuffle(l);
	   l.toArray(n);
	   System.out.println(Arrays.toString(n));
	}
}
