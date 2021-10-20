package estruturaRepeticao;

public class ForMultiplo {

	public static void main(String[] args) {

		int x;

		for (x = 1000; x <= 1999; x++) {
			if ((x % 11) == 5) {
				System.out.print("\n" + x);
			}
		}

	}
}
