public class Vector3 {
	public int x, y, z;
	
	public Vector3(int x, int y) {
		this(x, y, 0);
	}
	
	public Vector3(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3 add(Vector3 v2) {
		x = x + v2.x;
		y = y + v2.y;
		z = z + v2.z;
		return this;
	}
	
	public Vector3 multiply(int number) {
		x = x * number;
		y = y * number;
		z = z * number;
		return this;
	}
	
	@Override
	public String toString() {
		return x + ", " + y + ", " + z;
	}
}
