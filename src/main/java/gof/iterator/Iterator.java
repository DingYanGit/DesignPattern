package gof.iterator;

abstract public class Iterator<T> {
	public abstract void First();
	public abstract void Next();
	public abstract boolean IsDone();
	public abstract T CurrentItem() throws Exception;
}
