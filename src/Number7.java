import java.util.Arrays;

public class Number7 {
	
	public static void main(String[] args) {
//		AlgoOne(30);
//		AlgoTwo(10);
		AlgoThree(10);
	}
	
	public static void AlgoOne(int n) {
		int[] a = new int[n-1];
		boolean unique = true;
		
		for (int i = 0; i < a.length; i++) {
			int j, rand = (int) (Math.random() * n);
			//Check a to see if rand is unique
			for (j = 0; j < a.length; j++) {
				if (a[j] == rand) {
					i--;
					j = a.length;
					unique = false;
				}
				else {
					unique = true;
				}
			}
			if (unique) a[i] = rand;
			
		}
		
		System.out.println("a: " + Arrays.toString(a));
	}
	
	public static void AlgoTwo(int n) {
		Boolean[] used = new Boolean[n + 1];
		int[] a = new int[n];
		int rand;
		
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n+1; k++) {
				rand = (int) (Math.random() * n + 1);
				if (used[rand] == null) {
					a[i] = rand;
					used[rand] = true;
					k = n+1;
				}
				else {
					k++;
				}
			}
		}
		System.out.println("a: " + Arrays.toString(a));
	}
	
	public static void AlgoThree(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i+1;
		}
		for (int i = 0; i < n; i++) {
			a = swapReferences(a, a[i], a[(int) Math.random() * i]);
		}
		System.out.println("a: " + Arrays.toString(a));
	}

	private static int[] swapReferences(int[] a, int i, int j) {
		int k = i;
		a[i] = j;
		a[j] = k;
		return a;
	}
}
