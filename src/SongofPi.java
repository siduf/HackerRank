import java.util.*;
public class SongofPi {

public static void main(String[] args){
		
int[] actual ={3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3,2,3,8,4,6};
String str="Now I wish I could recollect pi Eureka cried the great inventor Christmas Pudding Christmas Pie Is the problems very center";

String[] s= str.split(" ");
boolean b =true;
int[] res = new int[s.length];
for(int i=0;i<s.length;i++){
	res[i]=s[i].length();
	//System.out.print(res[i]+" ");
}
for(int i=0;i<res.length;i++){
	if(res[i]!=actual[i])
		b=false;
}


if(b)
	System.out.println("It's a pi song.");
else
	System.out.println("It's not a pi song.");
}
}
	 

