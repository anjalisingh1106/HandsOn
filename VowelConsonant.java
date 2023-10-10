import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String s = sc.next();
	    int vowel=0;
	    int consonant=0;
	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' ||c=='I' || c=='O' ||c=='U' ){
	            vowel++;
	        }
	        else{
	            consonant++;
	        }
	    }
	    System.out.println("vowel - " + vowel);
	    System.out.println("consonant -"+consonant);
	}
}
