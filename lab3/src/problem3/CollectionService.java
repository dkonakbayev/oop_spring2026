package problem3;

import java.util.ArrayList;

public class CollectionService<T> implements MyCollection<T>{
	
	private ArrayList<T> list = new ArrayList<>();
	
	@Override 
	public void add(T element) {
		list.add(element);
	}
	
	@Override
	public void remove(T element) {
		list.remove(element);
	}
	
	@Override
	public boolean contains(T element) {
		return list.contains(element);
	}
	
	@Override
	public int size() {
		return list.size();
	}
	
	@Override 
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
}
