package by.htp.collections.LinkedList.MyLinkedList;

import by.htp.collections.MyCollections;

public class MyLinkedList<E> implements MyCollections<E> {

	private Node<E> firstNode;
	private Node<E> lastNode;
	private int size = 0;
	
	public MyLinkedList(){
		lastNode = new Node(null, firstNode, null);
		firstNode = new Node(null, null, lastNode);
	}
	
	@Override
	public void addLast(E e) {
		Node prev = lastNode;
		prev.setCurrentElement(e);
		lastNode = new Node<E>(null, prev, null);
		prev.setNextElement(lastNode);
		size++;
	}

	@Override
	public E getElementByIndex(int position) {
		Node<E> target = getNodeByPosition(position);
		return target.getCurrentElement();			
	}
	
	@Override
	public int size() {
		return size;
	}
		
	@Override
	public void addFirst(E e) {
		Node next = firstNode;
		next.setCurrentElement(e);
		firstNode = new Node<E>(null, null, next);
		next.setPrevElement(firstNode);
		size++;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		Node node = firstNode.getNextElement();
		
		for(int i = 0; i < size; i++){
			result.append(node.getCurrentElement()).append(", ");
			node = node.getNextElement();
		}
		return "[" + result.toString() + "]";
	
	}

	@Override
	public void setPosition(int position, E e) {
		checkPosition(position);
		
		Node prev = getNodeByPosition(position - 1);
		
		Node newElement = new Node<E>(e, prev, prev.getNextElement());
		prev.setNextElement(newElement);
		size++;
		
	}
	
	@Override
	public void remove (int position){
		Node node = getNodeByPosition(position);
		Node nextNode = node.getNextElement();
		Node prevNode = node.getPrevElement();
		prevNode.setNextElement(nextNode);
		nextNode.setPrevElement(prevNode);
		size--;
		
	}
	
	@Override
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		return false;
	}
	
	
	public void checkPosition(int position){
		if(position > size){
			throw new NullPointerException();
		}
	}
	
	public Node<E> getNodeByPosition(int position){
		Node<E> node = firstNode;
		for (int i = 0; i < position + 1; i++) {
			node = node.getNextElement();
		}
		return node;
	}



	private class Node<E>{
		private E currentElement;
		private Node<E> nextElement;
		private Node<E> prevElement;
		
		private Node(E currentElement, Node<E> prevElement, Node<E> nextElement){
			this.currentElement = currentElement;
			this.prevElement = prevElement;
			this.nextElement = nextElement;
		}

		public Node<E> getNextElement() {
			return nextElement;
		}

		public void setNextElement(Node<E> nextElement) {
			this.nextElement = nextElement;
		}

		public E getCurrentElement() {
			return currentElement;
		}

		public void setCurrentElement(E currentElement) {
			this.currentElement = currentElement;
		}

		public Node<E> getPrevElement() {
			return prevElement;
		}

		public void setPrevElement(Node<E> prevElement) {
			this.prevElement = prevElement;
		}
		
	}









	

	
	


	
	
}
