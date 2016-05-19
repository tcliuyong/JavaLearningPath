package BaseJava.algorithm;

public class testTree {


			public static void main(String[] args) {
				Tree<Integer> tree = new Tree<Integer>();
				tree.buildTree();
				System.out.println("�������");
				tree.inOrderTraverse();
				tree.nrInOrderTraverse();
				System.out.println("��������");
				//tree.nrPostOrderTraverse();
				tree.postOrderTraverse();
				tree.nrPostOrderTraverse();
				System.out.println("�������");
				tree.preOrderTraverse();
				tree.nrPreOrderTraverse();


	}

}
