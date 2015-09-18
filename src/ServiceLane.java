	import java.util.*;
	import java.io.*;
	public class ServiceLane {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("first.py"));
			int length=in.nextInt();
			int T=in.nextInt();
			int[] a = new int[length];
			for(int i=0;i<length;i++){
				a[i]=in.nextInt();
				//System.out.print(a[i]+" ");
			}
			int[] t = new int[2];
			int output=0;
			for(int i=1;i<=T;i++){
				
				for(int j=0;j<2;j++){
					t[j]=in.nextInt();
					
				}
				
				output=findMin(a, t[0], t[1]);
				System.out.println(output);
				
			}
			
		
	}
	
	public static int findMin(int[] a ,int i1 ,int i2){
		int min=a[i1];
		for(int i=i1+1;i<=i2;i++){
		      if(min>a[i]) 
				min=a[i];
		}
		
		return min;
	}
	}
