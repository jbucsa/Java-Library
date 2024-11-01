// Breadth First Search – The algorithm uses a queue to explore the nearest 1 for each 0 in the binary matrix, which is a characteristic of Breadth-First Search (BFS).
// This code snippet is for searching the nearest 1 for each 0 in a binary matrix. From any cell (i,j), you can move only in four directions: up, down, left, and right.

import java.util.*;
import javafx.util.Pair;

public static void getNearest(int[][] matrix, int m, int n){
    // Matrix - Binary Matrix
    // m,n - numbers of rows and columns
    int [][] dist = new int[n][m];
    int[] stepx = {-1, 1, 1, -1};
    int[] stepy = {1, -1, 1, -1};

    Queue<Pair<Integer, Integer>> q = new LinkedList<>();
    for (int i = 0; i < m; i++){
        for (int j =0; j < n; j++){
            if(matrix[i][j] == 1){
                dist[i][j] = 0;
                q.add( new Pair<>(i,j));
            } else {
                dist [i][j] = m*n;
            }
        }
    }

    while (!q.isEmpty()){
        Pair<Integer, Integer> tmp = q.remove();
        int x = tmp.getKey(), y = tmp.getValue();

        for (int i = 0; i < 4; i++){
            int newx = x + stepx[i];
            int newy = y + stepy[i];

            if( 0 <= newx && newx < m && 0 <= newy && newy < n && dist[newx][newy] > dist[x][y] + 1 ){
                dist[newx][newy] = dist[x][y] + 1;
                q.add(new Pair<>(newx, newy));
            }
        }
    }

    for (int[ v : dist]){
        System.out.println(Arrays.toString(v));
    }
}