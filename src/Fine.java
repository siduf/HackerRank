import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Fine {
	public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner in = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        String str = "abc";
        String str1="";
        
        
        
        
       
        
        Scanner in = new Scanner(new File("first.py"));
        int late_days=0,late_months=0,fine=0;
        while(in.hasNext()){
            a.add(in.nextInt());
            }
      
        
        if((a.get(5)==a.get(2)) && (a.get(1)==a.get(4)) && (a.get(0)<=a.get(3))){
            late_days=0;
            late_months=0;
        	fine=0;
           
        }
        
        else if((a.get(5)==a.get(2)) && (a.get(1)==a.get(4)) && (a.get(0)>a.get(3))){ 
             late_days=a.get(0)-a.get(3);
             late_months=0;
            fine=late_days*15;
           
        }
        
        else  if((a.get(5)==a.get(2)) && (a.get(1)!=a.get(4))){
            late_months=a.get(4)-a.get(1);
            fine=late_months*late_months;
           
        }
        
        else{
        	late_days=0;
        	late_months=0;
        
          //fine=10000;     
           
        }
        System.out.println("Fine: "+fine);
    }
	

}
