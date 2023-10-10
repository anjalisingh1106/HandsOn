public class PyramidChar {
    public static void main(String[] args) {
		for(int i=1;i<=4;i++){
		    for(int j=1;j<=4-i;j++){
		        System.out.print(" ");
		    }
		    char c=65;
		    for(int j=1;j<=(2*i)-1;j++){
		        System.out.print(c);
		        c++;
		    }
		        System.out.println();
		}
		
		
	}
}
