package Graph;


import java.util.*;

public class NumberOfIslands {

    public static int numIslands(char[][] grid) {

        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    private static void dfs(char[][] grid, int i, int j) {

        // TODO: Base conditions
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0') return;
        // TODO: Mark current cell as visited
        grid[i][j]='0';
        // TODO: Explore all 4 directions
        dfs(grid,i-1,j);//up
        dfs(grid,i+1,j);//down
        dfs(grid,i,j-1);//left
        dfs(grid,i,j+1);//right
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println("Number of Islands: " + numIslands(grid));
    }
}
