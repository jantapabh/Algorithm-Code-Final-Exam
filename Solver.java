
// Solver.java
// Andrew Davison, ad@fivedots.coe.psu.ac.th, April 2020

/* Usage:
    > javac *.java

    > java Solver maze1.txt    // maze2.txt
*/


import java.io.*;
import java.util.*;


public class Solver 
{
  private static final int[][] STEPS = 
          { {0, 1}, {1, 0}, {0, -1}, {-1, 0} };  // (dx, dy)
         //  DOWN    RIGHT    UP      LEFT


  public Solver(Maze maze) 
  {
    ArrayList<Coord> path = new ArrayList<>();
    Coord entry = maze.getEntry();
    if (explore(maze, entry.getX(), entry.getY(), path)) {
       maze.printPath(path);
       // maze.reset();
    }
    else
      System.out.println("No path found");
  }  // end of Solver()



  private boolean explore(Maze maze, int x, int y,
                                   ArrayList<Coord> path) 
  {
    if (!maze.isValidLoc(x, y) || 
         maze.isWall(x, y) || 
         maze.wasVisited(x, y))
      return false;

    path.add(new Coord(x, y));
    maze.setVisited(x, y);

    if (maze.isExit(x, y))
      return true;

    for (int[] step : STEPS) {
      Coord coord = getNextCoord(x, y, step);
      if (explore(maze, coord.getX(), coord.getY(), path))
        return true;
    }

    path.remove(path.size() - 1);  // remove failed last step
    return false;
  }  // end of explore()


  private Coord getNextCoord(int x, int y, int[] step) 
  {  return new Coord(x+step[0], y+step[1]);  }


  // --------------------------------------------


  public static void main(String[] args) throws Exception 
  {
    if (args.length == 0)

      System.out.println("Usage: java Solver <maze textfile>");

    else {
      Maze maze = new Maze( new File(args[0])); 
      Solver dfs = new Solver(maze);
    System.out.println(dfs);
    }
  }

}  // end of Solver class
