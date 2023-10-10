import java.util.Scanner;

public class ReverseString {

    static String reverse(String s, String r,int i){
        if(i<0){
            return r;
        }
        return reverse(s,r+s.charAt(i),i-1);
    }
    
    

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   String s = sc.next();
	   String  rev="";
	   for(int i=s.length()-1;i>=0;i--){
	       rev+=s.charAt(i);
	   }
	   System.out.println(rev);
       System.out.println(reverse(s,"",s.length()-1));
	}
}
