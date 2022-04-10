package fh.campus02.Labyrinth;

public class CrazyLabyrinth {
    public static void main(String[] args) {
        CrazyLabyrinth c= new CrazyLabyrinth();
        LabyrinthTile t1=new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile t2=new LabyrinthTile(Direction.UP, Direction.RIGHT);
        LabyrinthTile t3=new LabyrinthTile(Direction.LEFT, Direction.DOWN);
        LabyrinthTile t4=new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile t5=new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile t6=new LabyrinthTile(Direction.UP, Direction.DOWN);
        LabyrinthTile[] arr=new LabyrinthTile[]{t1,t2,t3,t4,t5,t6};

        boolean b=c.checkPathConsistency(arr);
        System.out.println(b);
    }
    public boolean checkPathConsistency(LabyrinthTile[] path) {
        for (int i = 0; i < path.length - 1; i++) {
            if (path[i].getExit() == Direction.LEFT) {
                if (path[i + 1].getEntry() != Direction.RIGHT) {
                    return false;
                }
            } else if (path[i].getExit() == Direction.RIGHT) {
                if (path[i + 1].getEntry() != Direction.LEFT) {
                    return false;
                }
            } else if (path[i].getExit() == Direction.UP) {
                if (path[i + 1].getEntry() != Direction.DOWN) {
                    return false;
                }
            } else if (path[i].getExit() == Direction.DOWN) {
                if (path[i + 1].getEntry() != Direction.UP) {
                    return false;
                }
            }
        }
        return true;
    }
}
