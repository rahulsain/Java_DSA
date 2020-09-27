package backtracking;

public class ShortestPathInAMaze {

	public static void main(String[] args) {
		int a[][] = {
				{1,1,0,0,0,1,0,1,0,1,1,0,1},
				{0,1,1,0,0,1,0,1,0,1,1,0,1},
				{1,1,0,1,1,1,0,0,0,1,1,0,1},
				{1,0,1,1,1,1,0,1,1,1,1,1,1},
				{1,1,1,1,0,1,0,1,0,1,1,0,1},
				{1,1,1,0,1,1,1,1,0,1,1,0,1},
				{1,1,1,0,0,1,0,1,0,1,0,0,0},
				{1,1,1,1,1,1,1,1,1,1,1,1,1}};
		int rows = a.length-1;
		int cols = a[0].length-1;
		
		int result = shortestPath(a, 1, 0, rows, cols);
		if(result >= 1000000000)
			System.out.println("No path possible");
		else
		System.out.println(result);
	}
	static int shortestPath(int a[][], int i,int j, int x , int y) {
		int rows = a.length;
		int cols = a[0].length;
		
		boolean vis[][] = new boolean[rows][cols];
		return shortestPath(a,i,j,x,y,vis);
	}
	
	static boolean isValid(int a[][], int i,int j,boolean vis[][]) {
		int rows = a.length;
		int cols = a[0].length;
		
		return i >= 0 && j >= 0 && i< rows && j < cols && a[i][j] == 1 && !vis[i][j];
	}
	static int shortestPath(int a[][], int i,int j, int x , int y,boolean vis[][]) {
		if(!isValid(a, i, j, vis)) return 1000000000;
		if(i == x && y == j)
			return 0;
		vis[i][j] = true;
		int left = shortestPath(a, i, j-1, x, y,vis) +1;
		int right = shortestPath(a, i, j+1, x, y,vis) +1;
		int top = shortestPath(a, i-1, j, x, y,vis) +1;
		int bottom = shortestPath(a, i+1, j, x, y,vis) +1;
		vis[i][j] = false; //this is line that enables the backtracking
		return Math.min(Math.min(top, bottom), Math.min(left, right));

	}
}
