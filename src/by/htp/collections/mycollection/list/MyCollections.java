package by.htp.collections.mycollection.list;

public interface MyCollections<E> extends Iterable<E>{
	
	void addLast(E e);
	void addFirst(E e);
	int size();
	E getElementByIndex(int index);
	void setPosition(int index, E e);
	void remove(int index);
	boolean isEmpty();

}
