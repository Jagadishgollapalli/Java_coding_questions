package practice;

public class FibonacciSeries {
	public static void main(String[] args) {
		int series[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		boolean isfibonacci = true;

		for (int i = 2; i < series.length; i++) {
			if (series[i] != series[i - 1] + series[i - 2]) {
				isfibonacci = false;
				break;
			}
		}
		if (isfibonacci) {
			System.out.println("Is a fibonacci pattern " + isfibonacci);
		} else {
			System.out.println("Is not a fibonacci pattern " + isfibonacci);
		}
	}
}
