import java.io.*;
import java.util.*;
public class AngryProf {
public static void main(String[] args) throws IOException{
	Scanner in = new Scanner(new File("first.py"));
	int num_testcases=in.nextInt();
    int n1=in.nextInt();
    int k1=in.nextInt();
    int[] a1=new int[n1];
    BufferedReader br = new BufferedReader(new FileReader("first.py"));
    String line1 = br.readLine();
    String[] strs = line1.trim().split("\\s+");
    for(int i=0;i<n1;i++){
    	a1[i]=Integer.parseInt(strs[i]);
    	System.out.print(a1[i]);
    }
    
    int n2=in.nextInt();
    int k2=in.nextInt();
    int[] a2 = new int[n2];
    while(in.hasNext()){
        int i=0;
        a2[i]=in.nextInt();
        i++;
    }
	
}
}
