package geekster;
import java.util.*;

public class Ascending {

		public static void main(String []args) {
		  ascend();	
		}
	   
		public static void ascend() {
			int a[]=new int[5];
			boolean flag=true;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Elements");
			for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			}
			sc.close();
			for(int j=0;j<a.length-1;j++){
				if(a[j+1]>a[j]) {
					flag=true;
				}
				else {
					flag=false;
				}
			}
			if(flag) {
			   System.out.println("True");
			}
			else {
			  System.out.println("False");
			}
		}
}


