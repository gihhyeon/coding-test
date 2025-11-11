package leetcode;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];

        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int oldColor, int newColor) {
        int n = image.length;
        int m = image[0].length;

        if (r < 0 || r >= n || c < 0 || c >= m) {
            return;
        }

        if (image[r][c] != oldColor) {
            return;
        }

        image[r][c] = newColor;

        dfs(image, r - 1, c, oldColor, newColor); // 위
        dfs(image, r + 1, c, oldColor, newColor); // 아래
        dfs(image, r, c - 1, oldColor, newColor); // 왼
        dfs(image, r, c + 1, oldColor, newColor); // 오
    }
}
