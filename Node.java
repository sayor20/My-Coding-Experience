//Node class

public class Node {
	Node next;
	Object data;
	
	Node(Object _data){
		this.data=_data;	
		this.next=null;
	}
	
	Node(Object _data,Node _next){
		this.data=_data;
		this.next=_next;
	}
	
	void setData(Object _data){
		this.data=_data;
	}
	
	void setNext(Node _next){
		this.next=_next;
	}
	
	Object getData(){
		return data;
	}
	
	Node getNext(){
		return next;
	}
	
}
