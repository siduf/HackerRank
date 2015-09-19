package linkedList;

public class Operations {
	void Print(Node head) {
	    Node temp;
	    temp=head;   
	    while(temp!=null){
	        System.out.println(temp.data+" ");
	        temp=temp.next;
	       
	       }
	  
	}
}
