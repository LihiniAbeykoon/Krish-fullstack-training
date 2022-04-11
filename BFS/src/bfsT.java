import java.util.LinkedList;
import java.util.Queue;

public class bfsT {
	static void traversal1(vertex Vertex) {
		Queue<vertex> q = new LinkedList<vertex>();
		
		q.add(Vertex);
		
		while(!q.isEmpty()) {
			Vertex = q.remove();
			
			System.out.println(Vertex.data + " ");
			
			if (Vertex.left != null)
				q.add(Vertex.left);
			
			if (Vertex.right != null)
				q.add(Vertex.right);
		}
	}

}
