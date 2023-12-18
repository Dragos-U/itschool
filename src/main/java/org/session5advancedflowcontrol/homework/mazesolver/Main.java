package org.session5advancedflowcontrol.homework.mazesolver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:/40_Java/itschool/src/main/java/org/session5/homework/mazesolver/maze.txt";
        int[][] maze = MazeUtilities.loadMazeFromFile(filePath);
        int[] startCoordinates = {0, 0};
        int[] endCoordinates = {9, 9};

        int[][] parentData = BreadthFirstSearch.findPathWithBFS(maze, startCoordinates, endCoordinates);
        List<int[]> backtrackedPath = MazeUtilities.backtrackPath(maze, parentData, startCoordinates, endCoordinates);
        MazeUtilities.printReconstructedMazeWithPath(maze, backtrackedPath);
    }
}
