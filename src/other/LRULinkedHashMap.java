package other;

import java.util.LinkedHashMap;

public class LRULinkedHashMap extends LinkedHashMap<Integer, String>{
	
	private int capacity;
	
	public LRULinkedHashMap(int size) {
		super(size, 0.75f, true);
		this.capacity = size;
	}

	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> entry) {
		return size() > capacity;
	}
}
