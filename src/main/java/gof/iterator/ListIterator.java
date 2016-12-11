package gof.iterator;
import java.util.List;

public class ListIterator<T> extends Iterator<T> {
	private int current = 0;
	private List<T> list;
	public ListIterator(List<T> aList) {
		this.list = aList;
	}
	public void First() {
		this.current = 0;
	}
	public void Next() {
		this.current++;
	}
	public boolean IsDone() {
		return this.current >= this.list.size();
	}
	public T CurrentItem() throws Exception {
		if (this.IsDone()) {
			throw new Exception("iterator out of bounds");
		}
		return this.list.get(this.current);
	}
}
