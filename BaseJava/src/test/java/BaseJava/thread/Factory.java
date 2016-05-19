package BaseJava.thread;

public class Factory {
	private int id;
	Factory(int id)
	{
		this.id = id;
	}
	public String toString()
	{
		return "Factory:" + id;
	}
}
