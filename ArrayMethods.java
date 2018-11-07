public class ArrayMethods {
	public static int rowSum(int [][] ary, int x) {
		int sum = 0;
		for (int i = 0; i < ary[x].length; i++) {
			try {
				sum += ary[x][i];
			}
			catch(ArrayIndexOutOfBoundsException e);
		}
		return sum;
	}
	public static int columnSum(int[][] ary, int x) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			try {
				sum += ary[i][x];
			}
			catch(ArrayIndexOutOfBoundsException e);
		}
		return sum;
	}
	
}