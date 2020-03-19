
import java.util.HashMap;

public class Association<K, V>{

	private HashMap<K, V> dicc;

	public Association() {
		dicc = new HashMap<K, V>();
	}

	public boolean containsKey(K key) {
		if (dicc.containsKey(key)) {
			return true;
		} else {
			return false;
		}
	}
	public V get(K key) {
		return dicc.get(key);
	}
	

	public void insertar(K key, V value) {
		dicc.put(key, value);
	}
}