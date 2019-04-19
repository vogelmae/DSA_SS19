package de.unistuttgart.vis.dsass2019.ex01.p2;

public class SpeedList<T> implements ISpeedList<T> {
	
	private class Node {
		private T data;
		private Node next = null;
		private Node next8 = null;
		
		private Node(T d, Node n) {
			this.data = d;
			this.next = n;
		}
		
		private Node(Node n) {
			this.next = n;
		}
		
		private Node getNext() {
			return this.next;
		}

		private Node getNext8() {
			return this.next8;
		}
		
		private T getData() {
			return this.data;
		}

		private void setNext8(Node n) {
			this.next8 = n;
		}
	}
	
	private Node head;
	
	//constructor points head to null
	public SpeedList() {
		this.head = null;
	}

	@Override
	public int size() {
		Node iter = this.head;
		int counter = 0;
		
		//count nodes, stops at the last node, which points to null
		while (iter != null) {
			iter = iter.getNext();
			counter++;
		}
		return counter;
	}

	@Override
	public void prepend(T t) {
		Node oldNode = this.head;
		Node newNode = new Node(t, oldNode);
		
		//checks if at least 7 nodes exist and sets the 8th node
		if (this.size() >= 8) {
			Node node8 = head;
			for (int i = 0; i < 7; i++)
				node8 = node8.getNext();
			newNode.setNext8(node8);
		}
		
		//point head to new node
		this.head = newNode;
	}

	@Override
	public T getElementAt(int pos) {
		Node iter = this.head;
		
		//cycles trough the nodes, till node at @param pos
		for (int i = 0; i < pos; i++) { 
			iter = iter.getNext();
			if (iter == null)
				throw new IndexOutOfBoundsException();
		}
		return iter.getData();
	}

	@Override
	public T getNext8thElementOf(int pos) {
		Node iter = this.head;
		
		//cycles trough the nodes, till node at @param pos
		for (int i = 0; i < pos; i++) { 
			iter = iter.getNext();
			if (iter == null)
				throw new IndexOutOfBoundsException();
		}
		
		//checks if 8th next node exist
		if (iter.getNext8() == null)
			throw new IndexOutOfBoundsException();
		else
			return iter.getNext8().getData();
	}
	
}
