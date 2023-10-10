import java.util.*;
public class CheckReverse
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String m = sc.next();
	    String rev="";
	    for(int i=n.length()-1;i>=0;i--){
	        rev+=n.charAt(i);
	    }
	    if(rev.equals(m)){
	        System.out.println("It is reverse");
	    }
	    else{
	        System.out.println("Not reverse");
	    }
	}
}