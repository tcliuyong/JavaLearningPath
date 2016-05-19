package BaseJava.linklist;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ImpLink implements Link {

	public linklist init() {
		// TODO Auto-generated method stub
		linklist head =  new linklist();
		head.data = 0;
		head.next = null;
		linklist h =  new linklist();
		for(int i = 1; i < 10; i++)
		{
			while(head.next != null)
			{
				head = head.next;
			}
			linklist tmp = new linklist();
			tmp.data = i;
			tmp.next = null;
			head.next = tmp;
			if(i == 1)
			{
				h = head;
			}
		}
		return h;
	}

	public linklist addLinkList(linklist head, int loc, int data) {
		linklist h = head;
		while(--loc != 0)
		{
			h = h.next;
		}
		linklist tmp = new linklist();
		tmp.data = data;
		tmp.next = h.next;
		h.next = tmp;
		return head;
	}

	public linklist delLinkList(linklist head, int loc) {
		// TODO Auto-generated method stub
		linklist t = new linklist();
		linklist del = new linklist();
		t = head;
		if(loc == 0)
		{
			return null;
		}
		if(loc == 1)
		{
			head = null;
			return t.next;
		}
		loc = loc - 1;
		while(--loc > 0)
		{
			t = t.next;
			if(t.next == null)
			{
				return null;
			}
		}
		del = t.next;
		t.next = del.next;
		del = null;
		return head;
	}

	public linklist reverseLinkList(linklist head) {
		// TODO Auto-generated method stub
		linklist pPre = new linklist();
		linklist pNode = new linklist();
		linklist pReverseHead = new linklist();
		pPre = null;
		pNode = head;
		while(pNode != null)
		{
			linklist pNext = new linklist();
			pNext = pNode.next;
			if(pNext == null)
			{
				pReverseHead = pNode;
			}
			pNode.next = pPre;
			pPre = pNode;
			pNode = pNext;
		}
		return pReverseHead;
	}

	public linklist kThLinkList(linklist head, int k) {
		// TODO Auto-generated method stub
		linklist t = new linklist();
		linklist p = new linklist();
		t = head;
		p = head;
		while(--k != 0)
		{
			t = t.next;
		}
		while(t.next != null)
		{
			t = t.next;
			p = p.next;
		}
		return p;
	}

	public linklist FindMidLinkList(linklist head) {
		// TODO Auto-generated method stub
		if(head == null)
		{
			return null;
		}
		linklist s = new linklist();
		linklist e = new linklist();
		s = head;
		e = head;
		
		while(e.next != null)
		{
			e = e.next;
			if(e.next != null)
				e = e.next;
			s = s.next;
		}
		return s;
	}

	public void SwapLinkList(linklist head, int data1, int data2) {
		// TODO Auto-generated method stub
		linklist tmp = new linklist();
		tmp = head;
		linklist p1 = new linklist();
		linklist p2 = new linklist();
		p1 = p2 = null;
		while(tmp.next != null)
		{
			if(tmp.data == data1)
			{
				p1 = tmp;
			}
			else if(tmp.data == data2)
			{
				p2 = tmp;
			}
			tmp = tmp.next;
		}
		if(p1 == null)
		{
			System.out.println("can not find data1");
		}
		else if(p2 == null)
		{
			System.out.println("can not find data2");
		}
		else
		{
			int t = p1.data;
			p1.data = p2.data;
			p2.data = t;
		}

	}

	public linklist delSameLinkList(linklist head) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		linklist t = new linklist();
		linklist s = new linklist();
		t = head;
		s = head;
		if(head == null)
		{
			return null;
		}
		while(t.next != null)
		{
			if(m.containsKey(t.data))
			{
				m.put(t.data, m.get(t.data) + 1);
			}
			else
			{
				m.put(t.data, 1);
			}
			t = t.next;
		}
		int loc = 1;
		while(s.next != null)
		{
			while(m.get(s.data) != 1)
			{
				head = this.delLinkList(head, loc);
				m.put(s.data, m.get(s.data) - 1);
			}
			++loc;
			s = s.next;
		}
		return head;
	}
}
