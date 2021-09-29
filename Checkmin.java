package geekster;
import java.util.*;

public class Checkmin {
	
	public static void main(String []args) {
	  min();	
	}
   
	public static void min() {
		int a[]=new int[5];
		int min=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++){
		a[i]=sc.nextInt();
		}
		sc.close();
		for(int j=0;j<a.length;j++){
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println("Minimum= "+min);
	}
}
