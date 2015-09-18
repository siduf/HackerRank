
public class Funny {
public static boolean isFunny(String str){
	
	str.trim();
	str.replaceAll("//s","");
	char[] c=str.toCharArray();
	char[] d=rev(c);
	//System.out.println(c[2]-c[1]);

	for(int i=1;i<c.length;i++){
		if(Math.abs(c[i]-c[i-1])!=Math.abs(d[i]-d[i-1]))
			return false;
	}
	return true;
}

public static char[] rev(char[] c){
	char[] d=new char[c.length];
	int j=c.length-1;
   for(int i=0;i<c.length;i++){
	  d[i]=c[j];
	  j--;
   }
   return d;
}

public static void main(String[] args){
	String str="bcxz";
	/*char[] c ={'a','c','x','z'};
	char[] d =rev(c);
	for(char c1:d)
		System.out.print(c1+" ");*/
	boolean b=isFunny(str);
	if(b)
		System.out.println("String is Funny");
	else
		System.out.println("String is not Funny");
}
}
