import java.util.*;
import java.io.*;
public class UtopianTree {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner in = new Scanner(new FileReader("first.py"));
		int T=in.nextInt();
		//int growth=1;
		for(int i=0;i<T;i++){
			int N=in.nextInt();
			int growth=1;
			if(N==0)
			   growth=1;
			for(int j=1;j<=N;j++){
				if(j%2==1)
					growth=2*growth;
				else
					growth++;
			}
			System.out.println(growth);
			
		}
	}
	}
