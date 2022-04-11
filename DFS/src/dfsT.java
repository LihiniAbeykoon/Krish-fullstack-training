public class dfsT {
	static void traversal1(vertex Vertex) {
		if (Vertex == null)
			return;
		System.out.println(Vertex.data);
		traversal1(Vertex.left);
		traversal1(Vertex.right);
	}

}
