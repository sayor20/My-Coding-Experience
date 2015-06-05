//program to implement linkedlist creation and its operations

import java.util.List;
import java.util.ArrayList;

public class LinkedList {
	Node head=new Node(null);
	int size=0;
	
	String s[]=new String[]{"2","3","4"};
	List<Integer> l1=new ArrayList<Integer>();
		
	void add(Object data){
		Node temp=new Node(data);
		Node current=head;
		
		while(current.getNext()!=null){
			current=current.getNext();
		}
		current.setNext(temp);
		size++;
	}
	
	void add(Object data,int index){
		Node temp=new Node(data);
		Node current=head;
		
		for(int i=1;i<index && current.getNext()!=null;i++){
			current=current.getNext();
		}
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		
	}
	
	Object get(int index){
		Node current=head;
		
		for(int i=1;i<index;i++){
			if(current.getNext()==null)
				return null;
				current=current.getNext();
		}
		
		return current.getData();
	}
	
	boolean remove(int index){
		Node current=head;
		
		for(int i=1;i<index;i++){
			if(current.next==null)
			return false;
			current=current.getNext();
		}		
		
		current.setNext(current.getNext().getNext());
		size--;
		return true;
	}
	
	
}
