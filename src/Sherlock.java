import java.util.*;
import java.io.*;
public class Sherlock {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("first.py"));
     int T=Integer.parseInt(br.readLine());
     int number=0;
     //System.out.println(T);
     for(int i=0;i<=T;i++){
    	 int N=Integer.parseInt(br.readLine());
    	 if(N<3) 
    		 System.out.println("-1");
    	 else if(N%3==0){
    		 for(int j=0;j<N;j++){
    			 number+=5*Math.pow(10,j);
    			 
    		 }
    		 System.out.println(number);
    	 }
    	 else if(N%5==0){
    		 for(int k=0;k<N;k++){
    			 number+=3*Math.pow(10,k);
    			 
    		 }
    		 System.out.println(number);
    	 }
    	 
    	 
    	 else{
    		 System.out.println("kachra");
    	 }
    	 
     }
     
}
}
