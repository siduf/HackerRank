
public class AltChar {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner in = new Scanner(System.in);
        //int T=in.nextInt();
        int T=1;
        for(int i=1;i<=T;i++){
            int count=0;
            String str="AAAA";
            char[] c=str.toCharArray();
            for(int j=c.length-1;j>0;j--){
                if(c[j]==c[j-1])
                    count++;
               }
            System.out.println(count);
            
        }
            
            
            
        }
        
}
