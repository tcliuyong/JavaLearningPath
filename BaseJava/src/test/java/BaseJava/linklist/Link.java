package BaseJava.linklist;

public interface Link {
	linklist init();
	linklist addLinkList(linklist head, int loc, int data);
	linklist delLinkList(linklist head, int loc);
	linklist reverseLinkList(linklist head);
	linklist kThLinkList(linklist head, int k);
	linklist FindMidLinkList(linklist head);
	void SwapLinkList(linklist head, int data1, int data2);
	linklist delSameLinkList(linklist head);
}
