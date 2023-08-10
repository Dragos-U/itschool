package org.session5.homework.mazesolver;

public class Cell {
    int rowNumber;
    int columnNumber;
    private static final int ROAD = 0;
    public static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public Cell(int row, int col) {
        this.rowNumber = row;
        this.columnNumber = col;
    }

    public static boolean isValidMove(int[][] maze, int xPosition, int yPosition) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean isXPositive = xPosition >= 0;
        boolean isYPositive = yPosition >= 0;
        boolean isXInTheMaze = xPosition < rows;
        boolean isYInTheMaze = yPosition < cols;

        return isXPositive && isXInTheMaze && isYPositive && isYInTheMaze && maze[xPosition][yPosition] == ROAD;
    }

}

