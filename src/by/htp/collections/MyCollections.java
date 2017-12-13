package by.htp.collections;

public interface MyCollections<E>{
	
	void addLast(E e);
	void addFirst(E e);
	int size();
	E getElementByIndex(int position);
	void setPosition(int position, E e);
	void remove(int position);
	boolean isEmpty();

}
