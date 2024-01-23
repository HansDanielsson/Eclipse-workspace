package trees;

public class Test {

	public static void main(String[] args) {
		// FIFA World Rankings http://en.wikipedia.org/wiki/FIFA_World_Rankings (9 Feb
		// 2017)

		BSTree<Integer> tree = new LBSTree<>();
		tree.insert("Argentina", 1635);
		tree.insert("Brazil", 1529);
		tree.insert("Germany", 1433);
		tree.insert("Chile", 1386);
		tree.insert("Belgium", 1371);
		tree.insert("France", 1313);
		tree.insert("Colombia", 1304);
		tree.insert("Portugal", 1240);
		tree.insert("Uruguay", 1195);
		tree.insert("Spain", 1168);

		System.out.println("Belgium: " + tree.search("Belgium"));
		System.out.println("France: " + tree.search("France"));
		System.out.println("Brazil: " + tree.search("Brazil"));
		System.out.println("England: " + tree.search("England"));
		System.out.println("Portugal: " + tree.search("Portugal"));
		System.out.println("Spain: " + tree.search("Spain"));
		System.out.println("Argentina: " + tree.search("Argentina"));
		System.out.println("Uruguay: " + tree.search("Uruguay"));
		System.out.println("Mexico: " + tree.search("Mexico"));
		System.out.println("Italy: " + tree.search("Italy"));
		System.out.println("Dummy: " + tree.search("Dummy"));
		
		System.out.println("PREORDER: " + tree.toStringPreOrder());
		System.out.println("INORDER: " + tree.toStringInOrder());
		System.out.println("POSTORDER: " + tree.toStringPostOrder());
		System.out.println("SIZE= " + tree.size());

		System.out.println("France: " + tree.extract("France"));

		System.out.println("France: " + tree.search("France"));

		System.out.println("INORDER: " + tree.toStringInOrder());
		System.out.println("SIZE= " + tree.size());
	}
}