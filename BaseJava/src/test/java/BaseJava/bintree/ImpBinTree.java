package BaseJava.bintree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class ImpBinTree implements BinTree{

	public BTreeNode initBTree(int value) {
		BTreeNode root = new BTreeNode();
		root.value = value;
		root.left = null;
		root.right = null;
		return root;
	}
	public BTreeNode addBTree(BTreeNode root,int data) {
		// TODO Auto-generated method stub
		BTreeNode node = new  BTreeNode();
		node.value = data;
		node.left = null;
		node.right = null;
		if(root == null)
		{
			root = node;
		}
		else if(data < root.value)
		{
			root.left = addBTree(root.left,data);
		}
		else if(data >= root.value)
		{
			root.right = addBTree(root.right,data);
		}
		return root;
	}
	public void showCenBTree(BTreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
		{
			return ;
		}
		showCenBTree(root.left);
		System.out.print(root.value + " ");
		showCenBTree(root.right);
	}
	public BTreeNode searchBTree(BTreeNode root,int data) {
		// TODO Auto-generated method stub
		if(root == null)
			return null;
		while(root != null)
		{
			if(data > root.value)
			{
				root = root.right;
			}
			else if(data < root.value)
			{
				root = root.left;
			}
			else
			{
				return root;
			}
			
		}
		return null;
		
	}
	public BTreeNode removeBTree(BTreeNode root, int data) {
		// TODO Auto-generated method stub
		BTreeNode bt = new BTreeNode();
		BTreeNode pNode = new BTreeNode();
		bt = searchBTree(root, data);
		pNode = getParentNode(root, bt);
		if(bt != null)
		{
			if(bt.left == null && bt.right == null)
			{
				if(pNode.left == bt)
				{
					pNode.left = null;
				}
				else
				{
					pNode.right = null;
				}
			}
			else if(bt.left != null && bt.right == null)
			{
				if(pNode.left == bt)
				{
					pNode.left =bt.left; 
				}
			
			}
			else if(bt.right != null && bt.left == null)
			{
				if(pNode.right == bt)
				{
					pNode.right =bt.right; 
				}
			}
			else if(bt.right != null && bt.left != null)
			{
				BTreeNode ptmp = new BTreeNode();
				BTreeNode tmp = new BTreeNode();
				ptmp = bt;
				if(pNode.left == bt && bt.right != null)
				{
					ptmp = ptmp.right;
					while(ptmp.left != null)
					{
						ptmp = ptmp.left;
					}
					
					if(ptmp.left == null && ptmp.right == null)
					{
						bt.value = ptmp.value;
						if(bt.right == ptmp)
						{
							bt.right = null;
						}
						else
						{
							bt.right = ptmp.right;
						}
					ptmp = null;
					}
					else
					{
						tmp = getParentNode(root, ptmp);
						bt.value = ptmp.value;
						if(tmp.value <= ptmp.right.value)
						{
							tmp.right = ptmp.right;
						}
						else
						{
							tmp.left = ptmp.right;
						}
			
					}
				}
				
				else if(pNode.right == bt && bt.left != null)
				{
					
					ptmp = ptmp.left;
					while(ptmp.right != null)
					{
						ptmp = ptmp.right;
					}
					bt.value = ptmp.value;
					if(ptmp.right == null && ptmp.left == null)
					{
						
						if(bt.left == ptmp)
						{
							bt.left = null;
						}
						else
						{
							bt.left = ptmp.left;
						}
					ptmp = null;
					}
				}
				else
				{
					pNode.right = bt.right;
				}
				bt = null;
			}
		}
		else
		{
			System.out.println("can not find node");
			return null;
		}
		return root;
		
	}
	public BTreeNode getParentNode(BTreeNode root, BTreeNode node) {
		BTreeNode pnode = new BTreeNode();
		pnode = root;
		if(root.value == node.value)
			return root;
		while(pnode.left != node && pnode.right != node)
		{
			if(pnode.value > node.value)
			{
				pnode = pnode.left;
			}
			else if(pnode.value < node.value)
			{
				pnode = pnode.right;
			}
			else
			{
				return null;
			}
			
		}
		return pnode;
	}
	public int getBreadthOfBTree(BTreeNode root) {
		// TODO Auto-generated method stub
		Queue<BTreeNode> qt = new LinkedList<BTreeNode>();
		int max = 1;
		if(root != null)
			qt.add(root);
		while(true)
		{
			int len = qt.size();
			if(len == 0)
			{
				break;
			}
			while(len > 0)
			{
				BTreeNode t = qt.poll();
				len --;
				if(t.left != null)
				{
					qt.add(t.left);
				}
				if(t.right != null)
				{
					qt.add(t.right);
				}
			}
			max = Math.max(max, qt.size());
		}
		return max;
	}
	public int getDeepOfBTree(BTreeNode root) {
		if(root == null)
			return 0;
		// TODO Auto-generated method stub\
		return getDeepOfBTree(root.left) > getDeepOfBTree(root.right)?(getDeepOfBTree(root.left) + 1):(getDeepOfBTree(root.right) + 1);
	}
	public int FindMaxLen(BTreeNode root) {
		int maxLen = 0;
		if(root == null)
			return 0;
		if(root.left == null)
		{
			root.maxLeft = 0;
		}
		if(root.right == null)
		{
			root.maxRight = 0;
		}
		if(root.left != null)
		{
			FindMaxLen(root.left);
		}
		if(root.right != null)
		{
			FindMaxLen(root.right);
		}
		if(root.left != null)
		{
			int max = 0;
			if(root.left.maxLeft > root.left.maxRight)
			{
				max = root.left.maxLeft;
			}
			else
			{
				max = root.left.maxRight;
			}
			root.maxLeft = max + 1;
		}
		if(root.right != null)
		{
			int max = 0;
			if(root.right.maxLeft > root.right.maxRight)
			{
				max = root.right.maxLeft;
			}
			else
			{
				max = root.right.maxRight;
			}
			root.maxRight = max + 1;
		}
		if(root.maxLeft + root.maxRight > maxLen)
		{
			maxLen = root.maxLeft + root.maxRight;
		}
		return maxLen;
	}
	public void DeepthFirst(BTreeNode root) {
		Stack<BTreeNode> s = new Stack<BTreeNode>();
		s.push(root);
		while(!s.empty())
		{
			root = s.pop();
			System.out.print(root.value + " ");
			
			if(root.right != null)
			{
				s.push(root.right);
			}
			if(root.left != null)
			{
				s.push(root.left);
			}
		
		}
		System.out.println();
	}
	public void BreadthFirst(BTreeNode root) {
		// TODO Auto-generated method stub
		if(root == null)
			return ;
		Queue<BTreeNode> q = new ArrayDeque<BTreeNode>();
		q.add(root);
		while(q.isEmpty() == false)
		{
			BTreeNode node = q.remove();
			System.out.print(node.value + " ");
			if(node.left != null)
			{
				q.offer(node.left);
			}
			if(node.right != null)
			{
				q.add(node.right);
			}
		}
		System.out.println();
	}
	public BTreeNode RevererBinTree(BTreeNode root) {
		// TODO Auto-generated method stub
        if (root == null) {
            return null;
        }
        String s = "test";
      
        root.left = RevererBinTree(root.left);
        root.right = RevererBinTree(root.right);
        BTreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
		return root;
	} 
 


}
