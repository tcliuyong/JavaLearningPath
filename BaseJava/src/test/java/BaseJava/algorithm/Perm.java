package BaseJava.algorithm;

public class Perm {

	private boolean[] used;
	private StringBuilder out = new StringBuilder();
	private final String in;
	public Perm(final String str)
	{
		in = str;
		used = new boolean[in.length()];
	}
	public void permte()
	{
		if(this.out.length() == in.length())
		{
			System.out.println(out);
			return;
		}
		for(int i = 0; i < in.length(); i++)
		{
			if(used[i]) continue;
			out.append(in.charAt(i));
			used[i] = true;
			permte();
			used[i] = false;
			out.setLength(out.length() - 1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perm p = new Perm("abc");
		p.permte();
	}

}
