package by.htp.collections.mycollection.list;

import java.util.Iterator;

public class MyArrayList<E> implements MyCollections<E> {

	private E[] values;
	private final static int DEFAULT_CAPACITY = 5;

	public MyArrayList() {
		values = (E[]) new Object[0];
	}

	@Override
	public void addLast(E e) {
		E[] temp = values;
		values = (E[]) new Object[temp.length + 1];
		System.arraycopy(temp, 0, values, 0, temp.length);
		values[values.length - 1] = e;
	}

	@Override
	public void addFirst(E e) {
		E[] temp = values;
		values = (E[]) new Object[temp.length + 1];
		System.arraycopy(temp, 0, values, 1, temp.length);
		values[0] = e;
	}

	@Override
	public int size() {
		return values.length;
	}

	@Override
	public E getElementByIndex(int index) {
		return values[index];
	}

	@Override
	public void setPosition(int index, E e) {
		values[index] = e;
	}

	@Override
	public void remove(int index) {
		E[] temp = values;

		values = (E[]) new Object[temp.length - 1];
		System.arraycopy(temp, 0, values, 0, index);
		System.arraycopy(temp, index + 1, values, index, values.length - index);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			sb.append(values[i]).append(", ");
		}
		return "[" + sb.toString() + "]";
	}

	@Override
	public boolean isEmpty() {
		return values.length == 0;
	}

	public Iterator<E> iterator() {
		return new ArrayIterator<>(values);
	}

}
