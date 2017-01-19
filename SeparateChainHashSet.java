package javagit;

import java.util.*;

public class SeparateChainHashSet<E> {
	
	private int currentSize = 0;
	private int m = 11;
	private LinkedList<E>[] data;
	
	public SeparateChainHashSet(){
		data = new LinkedList[m];
		for(int i = 0; i < m; i++){
			data[i] = new LinkedList<>();
			if(i >= 11){
				remove(data[i]);
		}
		
		}
		
	}
	public boolean add(E e){
		int hash = (e.hashCode() & 0x7ffffff) % m;
		List<E> values = data[hash];
		if (values.contains(e)){
			return false;
		}

		values.add(e);
		currentSize++;
		return true;
	}
	
	public boolean remove(Object o){
		int hash = (o.hashCode() & 0x7ffffff) % m;
		List<E> values = data[hash];
		if(values.contains(o)){
			values.remove(o);
			currentSize--;
			return true;
		}
		return false;
	}
	public boolean contains(Object o){
		int hash = (o.hashCode() & 0x7ffffff) % m;
		return data[hash].contains(0);

	}
	public int size(){
		return currentSize;
	}
	
	
	

}
