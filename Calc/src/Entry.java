public class Entry {
	public static void main(String[] args) {
		Maths m = new Maths();
		int a = 7;
		int b = 8;
		
		m.add(a, b);
		m.multiply(a, b);
		m.substract(a, b);
		m.division(a, b);
		m.square(a);
		m.cube(a);
	}
}