import java.util.*;
public class Panagram {
public static void main(String[] args){
	String str="We promptly judged antique ivory buckles for the prize";
	str=str.trim();
	boolean b =true;
	str=str.replaceAll("\\s", "");
	str=str.toLowerCase();
	char[] c= str.toCharArray();
	Set<Character> set1 = new TreeSet<Character>();
	Set<Character> set2 = new TreeSet<Character>();
	char[] actual= new char[26];
    int j=97;
	while(j<=122){
	for(int i=0;i<26;i++){
		actual[i]=(char)(j);
		j++;
	set1.add(actual[i]);
	}
	}
	int count=0;
	for(int k=0;k<c.length;k++){
		set2.add(c[k]);
	}
	 b=set1.containsAll(set2);
	if(b)
		System.out.println("pangram");
	else
		System.out.println("not pangram");
	
	
}



}
