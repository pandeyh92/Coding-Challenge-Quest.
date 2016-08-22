package singleLinkedList;

import java.util.Scanner;

public class SLList {
	public static Node headNode = null;
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt=0;
		while(true){
			System.out.println("Choose Operation!!");
			System.out.println("1. Display");
			System.out.println("2. Search");
			System.out.println("3. Insert");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			opt=sc.nextInt();
			switch(opt){
			case 1 :
				display();
				break;
				
			case 2 :
				search(headNode);
				break;
				
			case 3 :
				headNode=insert(headNode);
				break;
				
			case 4 :
				headNode=delete(headNode);
				break;
				
			case 5 :
				System.exit(0);
			}
		}
		
	}
	public static void search(Node headNode){
		System.out.println("Enter node to be searched");
		int numSrch = sc.nextInt();
		Node currNode=headNode;
		int count=0;
		if(currNode==null){
			System.out.println("Can't be searched as Linked List is empty!!");
		}
		else{
			while(currNode!=null){
				count++;
				if(currNode.getData()==numSrch){
					System.out.println("Data found at node"+count);
					break;
				}
				currNode=currNode.getNext();
			}
		}
	}
	public static void display(){
		Node currNode= headNode;
		if(currNode.getData()==0){
			System.out.println("List Emplty");
		}
		else{
			while(currNode!=null){
				System.out.println("->"+currNode.getData());
				currNode= currNode.getNext();
			}
		}
	}
	public static Node insert(Node headNode){
		System.out.println("Enter data");
		int numInsrt = sc.nextInt();
		System.out.println("Enter postion");
		int pos = sc.nextInt();
		Node currNode= headNode;
		if(headNode==null){
			if(pos==1){
				Node head=new Node(); 
				head.setData(numInsrt);
				return head;
			}
			else{
				System.err.println("Wrong Position");
				return null;
			}
		}
		else{
			int cnt=1;
			Node lngthNode = headNode;
			while(lngthNode!=null){
				lngthNode=lngthNode.getNext();
				cnt++;
			}
			if(pos==1){
				Node tmpNode = new Node();
				tmpNode.setData(numInsrt);
				tmpNode.setNext(currNode);
				headNode=tmpNode;
			}
			else{
				if(pos>cnt){
					System.out.println("Position exceeding alot");
				}
				else{
					int count=1;
					Node prvNode = null;
					Node tmpNode = new Node();
					tmpNode.setData(numInsrt);
					prvNode=headNode;
					while(count!=pos-1){
						prvNode=prvNode.getNext();
						count++;
					}
					if(count==pos-1)
					{
						currNode=prvNode.getNext();
						prvNode.setNext(tmpNode);
						tmpNode.setNext(currNode);
					}else
					{
						System.err.println("Wrong position again!!");
					}	
				}
			}
		}
		return headNode;
	}
	public static Node delete(Node headNode){
		System.out.println("Enter position");
		int pos = sc.nextInt();
		Node currNode = headNode;
		if(currNode==null){
			System.out.println("List is empty, can't delete!!");
			return null;
		}
		else{
			int cnt=1;
			Node lngthNode = headNode;
			while(lngthNode!=null){
				lngthNode=lngthNode.getNext();
				cnt++;
			}
			if(pos==1){
				currNode=headNode.getNext();
				Node tmpNode=headNode;
				headNode=currNode;
				System.out.println("Deleted node"+tmpNode.getData());
				return headNode;
			}
			else{
				if(pos>cnt){
					System.out.println("Position exceeding the length of list");
				}
				else{
					int count=1;
					Node prevNode = headNode;
					while(count!=pos-1){
						prevNode=prevNode.getNext();
						count++;
					}
					currNode=prevNode.getNext();
					prevNode.setNext(currNode.getNext());
					System.out.println("Deleted node"+currNode.getData());
					currNode=null;
				}
				return headNode;
			}
		}
	}
}
