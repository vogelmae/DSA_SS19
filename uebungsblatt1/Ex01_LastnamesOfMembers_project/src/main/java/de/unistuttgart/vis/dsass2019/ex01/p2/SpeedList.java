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
		
		private void setNext(Node n) {
			this.next = n;
		}
		
		private Node getNext8() {
			return this.next8;
		}
		
		private void setNext8(Node n) {
			this.next8 = n;
		}
		
		private T getData() {
			return this.data;
		}
	}
	
	private Node head;
	
	public SpeedList() {
		this.head = new Node(null);
	}

	@Override
	public int size() {
		Node iter = this.head;
		int counter = 1;
		while (iter.getNext() != null)
			iter = iter.getNext();
			counter++;
		return counter;
	}

	@Override
	public void prepend(T t) {
		Node oldNode = this.head.getNext();
		Node newNode = new Node(t, oldNode);
		this.head.setNext(newNode);
	}

	@Override
	public T getElementAt(int pos) {
		Node iter = this.head;
		for (int i = 0; i <= pos; i++) { 
			iter = iter.getNext();
			//if (iter == null)
			 //TODO trow expeiton
		}
		return iter.getData();
	}

	@Override
	public T getNext8thElementOf(int pos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//TODO remove:
	public void printAll(int a) {
		Node iter = this.head;
		for (int i = 0; i < a; i++) {
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
	}

}
