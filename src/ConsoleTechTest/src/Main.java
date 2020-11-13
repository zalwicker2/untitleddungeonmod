
public class Main {
	public static void main(String[] args) {
		Integer[][] base = {{ 1, 0, 0, 1}, {1,0,0,0}, { 1, 0, 0, 0}, {1,0,0,1}};
		Matrix<Integer> matrix = new Matrix<Integer>(base);
		Room room = new Room(matrix, new Vector3(0, 0, 0));
		System.out.println(room.toString());
		room.BranchRoom(1);
	}
}
