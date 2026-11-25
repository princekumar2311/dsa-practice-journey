package Graph;


public class FloodFill {

    public static int[][] floodFill(
            int[][] image, int sr, int sc, int color) {
        // TODO 1: Store original color
        int currentColor=image[sr][sc];
        // TODO 2: Call DFS
        dfs(image, sr, sc, currentColor, color);
        return image;
    }

    private static void dfs(
            int[][] image, int row, int col,
            int originalColor, int newColor) {
        // TODO 3: Handle same-color edge case
        // TODO 4: Check boundaries
        // TODO 5: Check original color
        if(row<0 || row>=image.length || col<0 || col>=image[0].length || image[row][col]==newColor || image[row][col]!=originalColor) return;

        // TODO 6: Change current pixel
        image[row][col]=newColor;
        // TODO 7: Explore four directions
        dfs(image, row + 1, col, originalColor, newColor);
        dfs(image, row - 1, col, originalColor, newColor);
        dfs(image, row, col + 1, originalColor, newColor);
        dfs(image, row, col - 1, originalColor, newColor);
    }

    public static void main(String[] args) {

        int[][] image = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[][] result = floodFill(image, 1, 1, 2);

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
