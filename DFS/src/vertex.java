public class vertex {
	
	vertex left;
	vertex right;
	String data;
	
	public vertex(String data) {
		this.data = data;
		
	}
	
	public vertex(String data, vertex left, vertex right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
}
