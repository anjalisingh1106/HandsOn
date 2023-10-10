import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int n = sc.nextInt();
	    int temp=0;
	    int num=s.length()/n;
	    String[] ans= new String[n];
	    for(int i=0;i<s.length();i+=num){
	        String p =s.substring(i,i+num);
	        ans[temp]=p;
	        temp++;
	        
	    }
	    for(int i=0;i<ans.length;i++){
	        System.out.println(ans[i]);
	    }
	}
}
