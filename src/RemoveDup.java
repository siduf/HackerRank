import java.util.*;
public class RemoveDup {
public static int[] removeDup(int[] a){
	int j = 0;
    int i = 1;
    //return if the array length is less than 2
    if(a.length < 2){
        return a;
    }
    while(i < a.length){
        if(a[i] == a[j]){
            i++;
        }else{
            a[++j] = a[i++];
        }   
    }
    int[] output = new int[j+1];
    for(int k=0; k<output.length; k++){
        output[k] = a[k];
    }
     
    return output;

}

public static void main(String[] args){
	int[] a={1,2,2,3,3};
	int[] res=removeDup(a);
	for(int n:res)
		System.out.print(n+" ");
}
}
