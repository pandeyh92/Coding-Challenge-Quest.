package printReverseLList;

public class PrintReverseList {
	public static Node Node1= new Node();
	public static Node Node2= new Node();
	public static Node Node3= new Node();
	public static Node Node4= new Node();
	public static Node Node5= new Node();
	public static Node Node6= new Node();
	public static Node Node7= new Node();
	public static Node Node8= new Node();
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			createList();
			reverseList(Node1);
	}
		public static Node createList(){
			Node1.setData(1);
			Node1.setNext(Node2);
			Node2.setData(2);
			Node2.setNext(Node3);
			Node3.setData(3);
			Node3.setNext(Node4);
			Node4.setData(4);
			Node4.setNext(Node5);
			Node5.setData(5);
			Node5.setNext(Node6);
			Node6.setData(6);
			Node6.setNext(Node7);
			Node7.setData(7);
			Node7.setNext(Node8);
			Node8.setData(8);
			Node8.setNext(null);
			return Node1;
		}
	public static void reverseList(Node Node1){
		if (Node1==null){
			return ;
		}
		reverseList(Node1.getNext());
		System.out.println(Node1.getData());
	}
	

}
