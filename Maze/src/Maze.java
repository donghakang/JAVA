public class Maze {
    int[][] rooms;
    boolean[][] upDoor;
    boolean[][] sideDoor;

    Maze() {
        int col = 4;
        int row = 5;
        this.rooms = new int[col][row];

        this.rooms[0][4] = 1;                // key 1
        this.rooms[2][0] = 2;                // key 2
        this.rooms[2][4] = 3;                // dest

        this.upDoor   = new boolean[col+1][row];
        this.sideDoor = new boolean[col][row+1];

        this.upDoor[1][2] = true;
        this.upDoor[2][2] = true;
        this.upDoor[3][2] = true;
        this.upDoor[3][0] = true;
        this.upDoor[3][4] = true;

        this.sideDoor[0][1] = true;
        this.sideDoor[0][2] = true;
        this.sideDoor[0][3] = true;
        this.sideDoor[0][4] = true;
        this.sideDoor[2][3] = true;
        this.sideDoor[3][1] = true;
        this.sideDoor[3][2] = true;
        this.sideDoor[3][3] = true;
        this.sideDoor[3][4] = true;
    }








}
