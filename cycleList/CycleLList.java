package cycleList;

import java.util.HashMap;

public class CycleLList {
	public static HashMap<Node, Integer> hm = new HashMap<Node, Integer>();
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
		Node headNode=createList();
		checkLoop(headNode);
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
		Node8.setNext(Node3);
		return Node1;
	}
	public static void checkLoop(Node headNode){
		Node tmpNode=headNode;
		if(tmpNode==null){
			System.out.println("List is Empty!!");
		}
		while(tmpNode!=null){
			if(hm.containsKey(tmpNode)){
				System.out.println("Cycle found at node: "+(tmpNode.getData()));
				break;
			}
			else{
				hm.put(tmpNode, tmpNode.getData());
				tmpNode=tmpNode.getNext();
			}
		}
	}

}
