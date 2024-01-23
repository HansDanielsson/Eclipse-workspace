package pack;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		int[][] mx = new int[n][n];
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (i < j) {
					mx[i][j] = 0;
				} else if (i == j) {
					mx[i][j] = 1;
				} else {
					mx[i][j] = 2;
				}
			}
		}
		for (int k = 0; k < mx.length; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print(mx[k][l]);
			}
			System.out.println();
		}
	}
}