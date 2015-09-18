import java.io.*;
import java.util.*;

public class InsertionSort {
public static void main(String[] args)throws IOException{
	Scanner in = new Scanner(new FileReader("first.py"));
	int N=in.nextInt();
	int[] input = new int[N];
	for(int i=0;i<N;i++){
		input[i]=in.nextInt();
	}
	int val=input[N-1];
	for(int i=N-2;i>=0;i--){
		if(val<input[i]){
	        input[i+1]=input[i];
	     printArray(input);   
		}
		else{
			input[i+1]=val;
		  printArray(input);
		  break;
		}
		
		System.out.println("");
	}
  }


public static void printArray(int[] ar){
	for(int j=0;j<ar.length;j++){
		System.out.print(ar[j]+" ");
	}
}
}
