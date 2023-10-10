import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s=s.toLowerCase();
		String res="";
		res+=(char)(s.charAt(0)-32);
		for(int i=1;i<s.length()-1;i++){
		    if(s.charAt(i-1)==32 || s.charAt(i+1)==32){
		             res+=(char)(s.charAt(i)-32);
		    }
		    else{
		        res+=s.charAt(i);
		    }
		}
		    res+=(char)(s.charAt(s.length()-1)-32);
		System.out.println(res);
	}
}
