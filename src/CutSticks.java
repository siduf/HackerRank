import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CutSticks {
	/*public static void main(String[] args) throws FileNotFoundException{
	    Scanner in = new Scanner(new FileReader("first.py"));
		int N = in.nextInt();
		 int count=N;
		int[] input = new int[N];
		for(int i=0;i<N;i++){
			input[i]=in.nextInt();
			
			}
		//find Min Number in array
		//Substract lowest number
		System.out.println(N+" ");
		N=input.length;
		while(N>1){
		Arrays.sort(input);
		int min=input[0];
		int countz=subsMin(input, min);
		N=N-countz;
		System.out.println(N);
		}
		
	}
	public static int findMin(int[] a){
			Arrays.sort(a);
			int n =a[0];
			return n;
		}
	public static int subsMin(int[] a,int min){
		int countz=0;
		for(int i=0;i<a.length;i++){
		     if(a[i]-min==0) countz++;	
		}
		return countz;
	}*/
	
	
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(new FileReader("first.py"));
	     int N =in.nextInt();
	     int[] input = new int[N];
	     for(int i=0;i<N;i++){
	    	 input[i]=in.nextInt();
	     }
	     Arrays.sort(input);
  		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
  		/*int value=1;
		for(int i=0;i<N;i++){
			if(map.containsKey(input[i]))
				map.put(input[i], value+1);
			else
				map.put(input[i], value);
		}
		//System.out.println(N);
		for(Integer value1:map.values()){
			
		System.out.println(value1);*/
	     
	     
	     for(Integer s:input){
	    	 if(map.containsKey(s)){
	    	   Integer i = map.get(s);
	    	   i++;
	    	 }else{
	    	   map.put(s, new Integer(1));
	    	 }
	    	 System.out.println(N);
	 		for(Integer value1:map.values()){
	 			N=N-value1;
	 		System.out.println(N);
	 		if(N==1)
	 			break;
			
		}
		
		
	}
	
	}
}

