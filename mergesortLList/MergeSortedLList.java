package mergesortLList;

import printReverseLList.Node;

public class MergeSortedLList {
	public static Node aNode1= new Node();
	public static Node aNode2= new Node();
	public static Node aNode3= new Node();
	public static Node aNode4= new Node();
	public static Node aNode5= new Node();
	public static Node aNode6= new Node();
	public static Node aNode7= new Node();
	public static Node aNode8= new Node();
	public static Node bNode1= new Node();
	public static Node bNode2= new Node();
	public static Node bNode3= new Node();
	public static Node bNode4= new Node();
	public static Node bNode5= new Node();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createList1();
		createList2();
		Node tmp=sortMergeList(aNode1, bNode1);
		while(tmp!=null){
			System.out.println(""+tmp.getData());
			tmp=tmp.getNext();
		}
		
	}
	public static Node createList1(){
		aNode1.setData(1);
		aNode1.setNext(aNode2);
		aNode2.setData(2);
		aNode2.setNext(aNode3);
		aNode3.setData(3);
		aNode3.setNext(aNode4);
		aNode4.setData(4);
		aNode4.setNext(aNode5);
		aNode5.setData(5);
		aNode5.setNext(aNode6);
		aNode6.setData(6);
		aNode6.setNext(aNode7);
		aNode7.setData(7);
		aNode7.setNext(aNode8);
		aNode8.setData(8);
		aNode8.setNext(null);
		return aNode1;
	}
	public static Node createList2(){
		bNode1.setData(3);
		bNode1.setNext(bNode2);
		bNode2.setData(5);
		bNode2.setNext(bNode3);
		bNode3.setData(7);
		bNode3.setNext(bNode4);
		bNode4.setData(10);
		bNode4.setNext(bNode5);
		bNode5.setData(15);
		bNode5.setNext(null);
		return bNode1;
	}
	public static Node sortMergeList(Node aNode1, Node bNode1){
		Node result=null;
		if(aNode1==null){
			return bNode1;
		}
		if(bNode1==null){
			return aNode1;
		}
		if(aNode1.getData()<=bNode1.getData()){
			result =aNode1;
			result.setNext(sortMergeList(aNode1.getNext(), bNode1));
		}
		else {
			result =bNode1;
			result.setNext(sortMergeList(bNode1.getNext(), aNode1));
		}
		return result;
	}

}
