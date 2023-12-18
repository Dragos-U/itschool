package org.session5advancedflowcontrol.homework.mazesolver;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearch {

    private BreadthFirstSearch() {
        throw new IllegalStateException("Breadth First Search");
    }

    public static int[][] findPathWithBFS(int[][] originalMaze, int[] startPoint, int[] endPoint) {
        int xStartCoordinates = startPoint[0];
        int yStartCoordinates = startPoint[1];
        int xCurrentCoordinate = endPoint[0];
        int yCurrentCoordinate = endPoint[1];
        int rows = originalMaze.length;
        int cols = originalMaze[0].length;
        boolean[][] wasVisited = new boolean[rows][cols];
        int[][] bfsMaze = new int[rows][cols];
        Queue<Cell> storedCellList = new ArrayDeque<>();

        storedCellList.offer(new Cell(xStartCoordinates, yStartCoordinates));
        wasVisited[xStartCoordinates][yStartCoordinates] = true;

        while (!storedCellList.isEmpty()) {
            Cell currentCell = storedCellList.poll();
            int xCoordinate = currentCell.rowNumber;
            int yCoordinate = currentCell.columnNumber;

            if (xCoordinate == xCurrentCoordinate && yCoordinate == yCurrentCoordinate) {
                break;
            }

            for (int[] searchDirection : Cell.DIRECTIONS) {
                int xNewCoordinate = xCoordinate + searchDirection[0];
                int yNewCoordinate = yCoordinate + searchDirection[1];

                if (Cell.isValidMove(originalMaze, xNewCoordinate, yNewCoordinate) && !wasVisited[xNewCoordinate][yNewCoordinate]) {
                    storedCellList.offer(new Cell(xNewCoordinate, yNewCoordinate));
                    wasVisited[xNewCoordinate][yNewCoordinate] = true;
                    bfsMaze[xNewCoordinate][yNewCoordinate] = xCoordinate * cols + yCoordinate;
                }
            }
        }
        return bfsMaze;
    }
}
