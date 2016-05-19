package BaseJava.bintree;

public interface BinTree {
	int getBreadthOfBTree(BTreeNode root);
	int getDeepOfBTree(BTreeNode root);
	BTreeNode initBTree(int value);
	BTreeNode addBTree(BTreeNode root, int value);
	BTreeNode searchBTree(BTreeNode root, int data);
	BTreeNode removeBTree(BTreeNode root, int data);
	void showCenBTree(BTreeNode root);
	BTreeNode getParentNode(BTreeNode root, BTreeNode node);
	int FindMaxLen(BTreeNode root);
	//void showPreBTree(BTreeNode root);
	//void showLastBTree(BTreeNode root);
	void DeepthFirst(BTreeNode root);
	void BreadthFirst(BTreeNode root);
	BTreeNode RevererBinTree(BTreeNode root);
}
