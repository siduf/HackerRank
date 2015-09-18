import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class FlippingBeats {
public static void main(String[] args) throws IOException{
	Scanner in = new Scanner(new FileReader("first.py"));
	int T=in.nextInt();
	for(int i=1;i<=T;i++){
		int n=in.nextInt();
		String str=Integer.toBinaryString(n);
	    char[] c = new char[str.length()];
	    char[] op = new char[32];
		for(int j=0;j<str.length();j++){
			c[j]=str.charAt(j);
		  }
		
		
		for(int k=0;k<32-c.length;k++){
			op[k]='0';
		}
		int len=0;
		while(len<c.length){
		for(int k=32-c.length;k<32;k++){
			op[k]=c[len];
			len++;
		}
		}
		for(int k=0;k<32;k++){
			if(op[k]=='0') op[k]='1';
			else if(op[k]=='1') op[k]='0';
			}
		
		
		long[] num = new long[32];
		for(int k=0;k<32;k++){
			num[k]=op[k]-'0';
		}
		String s1="";
		for(int k=0;k<op.length;k++){
			s1=s1+op[k];
		}
		//System.out.println(s1);
		long finalAns=Long.parseLong(s1,2);
		System.out.println(finalAns);
		
	}
	
	
	
	
}

}
