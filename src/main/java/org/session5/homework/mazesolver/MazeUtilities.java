package org.session5.homework.mazesolver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MazeUtilities {

    public static int[][] loadMazeFromFile(String fileName) {
        List<int[]> rows;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            rows = bufferedReader.lines()
                    .map(line -> Arrays.stream(line.split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0][0];
        }
        return rows.toArray(new int[0][]);
    }

    public static List<int[]> backtrackPath(int[][] originalMaze, int[][] bfsMaze, int[] startPoint, int[] endPoint) {
        int numberOfColumns = originalMaze[0].length;
        List<int[]> backtrackedPath = new ArrayList<>();
        int xStartCoordinates = startPoint[0];
        int yStartCoordinates = startPoint[1];
        int xCurrentCoordinate = endPoint[0];
        int yCurrentCoordinate = endPoint[1];

        while (xCurrentCoordinate != xStartCoordinates || yCurrentCoordinate != yStartCoordinates) {
            backtrackedPath.add(new int[]{xCurrentCoordinate, yCurrentCoordinate});
            int retrievedParentCell = bfsMaze[xCurrentCoordinate][yCurrentCoordinate];
            xCurrentCoordinate = retrievedParentCell / numberOfColumns;
            yCurrentCoordinate = retrievedParentCell % numberOfColumns;
        }
        backtrackedPath.add(startPoint);
        Collections.reverse(backtrackedPath);
        List<int[]> reconstructedPath = backtrackedPath;

        return reconstructedPath;
    }

    public static void printReconstructedMazeWithPath(int[][] originalMaze, List<int[]> reconstructedPath) {
        if (reconstructedPath == null || reconstructedPath.isEmpty()) {
            System.out.println("No solution found.");
            return;
        }

        int[][] reconstructedMaze = new int[originalMaze.length][originalMaze[0].length];
        for (int[] cell : reconstructedPath) {
            reconstructedMaze[cell[0]][cell[1]] = 1;
        }

        for (int xCoordinate = 0; xCoordinate < reconstructedMaze.length; xCoordinate++) {
            for (int yCoordinate = 0; yCoordinate < reconstructedMaze[0].length; yCoordinate++) {
                if (reconstructedMaze[xCoordinate][yCoordinate] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(originalMaze[xCoordinate][yCoordinate] + " ");
                }
            }
            System.out.println();
        }
    }
}
