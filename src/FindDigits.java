import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class FindDigits {
public static void main(String[] args) throws FileNotFoundException{
	Scanner in = new Scanner(new FileReader("first.py"));
	int T=in.nextInt();
	//int T=1;
	for(int i=0;i<T;i++){
	 int N=in.nextInt();
	// int N=1000;
	 int count=0;
		ArrayList<Integer> a =breakNum(N);
		count=countOccur(N, a);
		System.out.println(count);
	}
}
public static int countOccur(int N,ArrayList<Integer> a){
int count=0,count1=0;
for(int i=0;i<a.size();i++){
	if(a.get(i)==0)
		count1++;
}
for(int j=0;j<a.size();j++){
			//if(a.get(j)==0) throw new ArithmeticException();
			if(a.get(j)!=0&&N%a.get(j)==0)
				count++;
			}
		return (count);
}
public static ArrayList<Integer> breakNum(int N){
	ArrayList<Integer> a = new ArrayList<Integer>();
	int first_num=0;
	while(N!=0){
		first_num=N%10;
		a.add(first_num);
		N=N/10;
	}
	return a;
}

}