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
	public static int allRowSums(int[][] ary, int x) {
		int [] result = new int[ary.length];
		for (int i = 0; i < ary.length; i++) {
			result[i] = rowSum(ary, i)
		}
		return result;
	}
	public static int allColSums(int[][] ary, int x) {
		int boi = 0;
      	for (int i = 0; i < ary.length; i ++) {
        	if (ary[x].length > boi) {
        		boi = ary[i].length;
        	}
     	}
		int [] result = new int[boi];
		for (int i = 0; i < ary.length) {
			result[i] = columnSum(ary,i);
		}
		return result;
	}
	public static boolean isRowMagic(int[][] ary) {
		int magicNumber = rowSum(ary,0);
		boolean magic = true;
		if (ary.length == 0) {
			return magic;
		}
		for (int i = 0; i < ary.length; i++) {
			if (rowSum(ary,i) != magicNumber) {
				magic = false;
			}
		}
		return magic;
	}
	public static boolean isColumnMagic(int[][] ary) {
		int magicNumber = columnSum(ary,0);
		boolean magic = true;
		if (ary.length == 0) {
			return magic;
		}
		int boi = 0;
      	for (int i = 0; i < ary.length; i ++) {
        	if (ary[x].length > boi) {
        		boi = ary[i].length;
        	}
     	}
		for (int i = 0; i < boi; i++) {
			if (columnSum(ary,i) != magicNumber) {
				magic = false;
			}
		}
		return magic;
	}
}