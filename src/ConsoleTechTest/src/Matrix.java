public class Matrix<T> {
	private T[][] content;
	public Matrix(int x, int y) {
		this.content = (T[][]) new Object[x][y];
	}
	
	public Matrix(T[][] content) {
		this.content = content;
	}
	
	public String toString() {
		String output = "";
		for(int x = 0; x < content.length; x++) {
			for(int y = 0; y < content[0].length; y++) {
				output+=(content[x][y] + " ");
			}
			output+="\n";
		}
		return output;
	}
	
	public void transpose() {
		for(int x = 0; x < content.length; x++) {
			for(int y = 0; y < x; y++) {
				T temp = content[x][y];
				content[x][y] = content[y][x];
				content[y][x] = temp;
			}
		}
	}
	
	public void set(int x, int y, T value) {
		content[x][y] = value;
	}
	public T get(int x, int y) {
		return content[x][y];
	}
	
	public int getWidth() {
		return content[0].length;
	}
	
	public int getLength() {
		return content.length;
	}
}
