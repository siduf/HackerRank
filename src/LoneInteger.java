import java.util.*;
public class LoneInteger {
public static int countOcccur(int[] a){
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	for(int i=0;i<a.length;i++){
		
		if(!map.containsKey(a[i])){
			map.put(a[i],1);
		}
		else{
			map.put(a[i],map.get(a[i])+1);
		}
	}
	
	return map.get(1);
}

public static void main(String[] args){
	int[] a={2,3,2,2,1,1};
	int m=countOcccur(a);
	//System.out.println(m);
	int x=5^6;
    System.out.println(x);
    
	
}
}
