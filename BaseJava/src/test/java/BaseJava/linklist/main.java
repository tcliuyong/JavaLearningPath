package BaseJava.linklist;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link l = new ImpLink();
	 	linklist t = l.init();
	 	linklist head = new linklist();
	 	t = l.addLinkList(t, 5, 5);
	 	t = l.addLinkList(t, 5, 0);
	 	head = t;
	 	//t = l.delLinkList(head, 1);
	 	 t = l.delSameLinkList(head);
	 	//t = l.reverseLinkList(t);
	 	//l.SwapLinkList(head, 3, 100);
		while(t.next != null)
		{
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.print(t.data + "\n");
		
		//System.out.println();
		//System.out.println(l.kThLinkList(head,1).data);
		//System.out.println(l.FindMidLinkList(head).data);
	}

}
