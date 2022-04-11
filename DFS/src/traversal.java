public class traversal {

	public static void main(String[] args) {
		
		try {
			vertex tree = sample_tree();
			dfsT.traversal1(tree);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static vertex sample_tree() {
		vertex root = new vertex("A",
				new vertex("B", 
						new vertex("C"), new vertex("D")),
				new vertex("E",
						new vertex("F"), new vertex("G",
								new vertex("H"),null)));
		return root;
	}

}
