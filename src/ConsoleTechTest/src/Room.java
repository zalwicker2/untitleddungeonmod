public class Room {
	Matrix<Integer> room;
	int width;
	int length;
	Vector3 offset;
	public Room (Matrix<Integer> room, Vector3 offset) {
		this.room = room;
		this.offset = offset;
		this.width = room.getWidth() - 1;
		this.length = room.getLength() - 1;
	}
	
	public void BranchRoom(int spawnCoeff) {
		for(Direction dir : Direction.values()) {
			Vector3 info = getOffsetFromDirection(dir).multiply((int) Math.floor(width / 2));
			int x = (int) ((Math.floor(width / 2) + info.x));
			int y = (int) ((Math.floor(length / 2) + info.z));
			int ext = room.get(y, x);
			if(ext == 0) {
				createRoom(dir);
			}
		}
	}
	
	public Room createRoom(Direction dir) {
		System.out.println(getOffsetFromDirection(dir).toString());
		return null;
	}
	
	private Vector3 getOffsetFromDirection(Direction dir) {
		switch(dir) {
			case NORTH:
				return new Vector3(0, 0, 1);
			case EAST:
				return new Vector3(1, 0, 0);
			case SOUTH:
				return new Vector3(0, 0, -1);
			case WEST:
				return new Vector3(-1, 0, 0);
		}
		return new Vector3(0, 0, 0);
	}
	
	public String toString() {
		return room.toString();
	}
}
