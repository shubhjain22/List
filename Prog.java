class Node{
	int data;
	Node next;
}

class LinkedList{
	Node start;
	public void add(int data){
		Node n = new Node();
		n.data = data;
		if(start==null){
			start = n;
			n.next = null;
			return;
		}
		Node temp;
		for(temp=start;temp.next!=null;temp=temp.next){

		}
		temp.next = n;
		n.next = null;
	}
	public void traverse(){
		Node temp;
		for(temp=start;temp!=null;temp=temp.next){
			System.out.println(temp.data);
		}
	}
}

class Prog{
	public static void main(String... args){
		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.traverse();
	}
}