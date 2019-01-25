import java.util.Arrays;

public class Number4 {

	public static void main(String[] args) {
		int[] N = new int[]{25, 50, 75, 100, 125, 150, 175, 200};
		long[] s1 = new long[N.length], s2 = new long[N.length],
			s3 = new long[N.length], s4 = new long[N.length],
			s5 = new long[N.length], s6 = new long[N.length];
		
		for(int i = 0; i < N.length; i++) {
			s1[i] = sumOne(N[i]);
			s2[i] = sumTwo(N[i]);
			s3[i] = sumThree(N[i]);
			s4[i] = sumFour(N[i]);
			s5[i] = sumFive(N[i]);
			s6[i] = sumSix(N[i]);
		}
		
		System.out.println("Summnation One: " + Arrays.toString(s1) + "\nSummnation Two: " + Arrays.toString(s2) +
				"\nSummnation Three: " + Arrays.toString(s3) + "\nSummnation Four: " + Arrays.toString(s4) +
				"\nSummnation Five: " + Arrays.toString(s5) + "\nSummnation Six: " + Arrays.toString(s6));

	}
	
	public static long sumOne(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum++;
		}
		return sum;
	}
	
	public static long sumTwo(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum++;
			}
		}
		return sum;
	}
	
	public static long sumThree(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n*n; j++) {
				sum++;
			}
		}
		return sum;
	}
	
	public static long sumFour(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		return sum;
	}
	
	public static long sumFive(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i*i; j++) {
				for (int k = 0; k < j; k++) {
					sum++;
				}
			}
		}
		return sum;
	}
	
	public static long sumSix(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i*i; j++) {
				if (j % i == 0) {
					for (int k = 0; k < j; k++) {
						sum++;
					}
				}
			}
		}
		return sum;
	}

}
