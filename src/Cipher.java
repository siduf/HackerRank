import java.util.*;
import java.io.*;
public class Cipher {
//public static void main(String[] args){
	public static String doCipher(String str,int k,int length){
	//String str="abc";
	//String output="";
	char[] c = new char[str.length()];
	char[] op = new char[str.length()];
	int[] asc = new int[c.length];
	k=k%length;
    for(int i=0;i<str.length();i++){
    	c[i]=str.charAt(i);
    	if(c[i]>='a'&&c[i]<='z'||c[i]>='A'&&c[i]<='Z'){
    	asc[i]=(int)c[i]+k;
    	op[i]=(char)asc[i];
    	}
    	else{
    		op[i]=c[i];
    	}
    }
   return con(op);
    }
public static String con(char[] c){
	String s = new String(c);
	return s;
}
public static void main(String[] args) throws FileNotFoundException{
	//String str = "middle-Outz";
  Scanner in = new Scanner(new File("first.py"));
  String str=" ";
  int k=0,n=0;
  while(in.hasNext()){
	  n=in.nextInt();
	  str=in.next();
	  k=in.nextInt();
  }
  System.out.println(doCipher(str, k,n));
   
}

}
