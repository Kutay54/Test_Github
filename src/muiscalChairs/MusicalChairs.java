package muiscalChairs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MusicalChairs {

	private List<String>names;
	
	public MusicalChairs(String... names) {
		// String... kann beliebig viele Strings übernehmen
		// Java regelt das intern mit einem Array
		// dadurch wird length und nicht size verwendet
		if(names.length > 0) {
			// Array.asList(names) - wandelt ein Array in eine Liste um
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}

	public List<String> getNames() {
		return names;
	}

	public void setName(List<String> names) {
		this.names = names;
	}
	
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp = tmp + itr.next() + ", ";
		}
		return tmp;
	}
	
	public void rotate(int distance) {
		Collections.rotate(this.names, distance);
	}
	
	public void rotateAndRemoveLast(int distance) {
		Collections.rotate(this.names, distance);
		((LinkedList<String>) this.names).removeLast();
	
	}
	public String play(int distance) {
        while (names.size() > 1) {
            rotateAndRemoveLast(distance);
        }
        return ((LinkedList<String>) names).getFirst();
    }
}

