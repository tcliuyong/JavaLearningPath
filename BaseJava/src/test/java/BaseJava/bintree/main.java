package BaseJava.bintree;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTree bt = new ImpBinTree();
		BTreeNode root = new BTreeNode();
		BTreeNode SerchNode = new BTreeNode();
		BTreeNode test = new BTreeNode();
		BTreeNode pNode = new BTreeNode();
		root = null;
		int[] a = {10,0,5,-2,20};
		
		for(int i = 0; i < a.length; i++)
		{
			root = bt.addBTree(root, a[i]);
		}
		bt.showCenBTree(root);
		System.out.println();
		
		SerchNode = bt.searchBTree(root, 0);
		if(SerchNode != null)
		System.out.println(SerchNode.value);
		else
		System.out.println("can not find it");
		pNode = bt.getParentNode(root, SerchNode);
		System.out.println(pNode.value);
 		test = bt.removeBTree(root, 0);
		bt.showCenBTree(test);
		int Breadth = bt.getBreadthOfBTree(root);
		System.out.println();
		System.out.println("Breadth: " + Breadth);
		int deep = bt.getDeepOfBTree(root);
		System.out.println("deep:  " + deep);
		int len = bt.FindMaxLen(root);
		System.out.println("maxLen:  " + len);
		bt.DeepthFirst(root);
		bt.BreadthFirst(root);
		test = bt.RevererBinTree(root);
		bt.showCenBTree(test);
	}

}
