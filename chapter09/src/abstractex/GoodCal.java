package abstractex;

public class GoodCal extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i = 1; i < a.length; i++) {
			sum+= a[i];			//sum = sum +a[i];
		}
		return sum / a.length;
	}

	public static void main(String[] args) {
		GoodCal c = new GoodCal();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int [] {2,3,4}));
	}
}
