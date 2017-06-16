package homework.seven.string;

import java.util.Date;

public class TaskOne {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		System.out.println(new Date());
		for (int i = 0; i <= 1000000; i++) {
			sb.append(i);
		}
		System.out.println(new Date());

		// System.out.println("-----");

		// String s = "";
		// System.out.println(new Date());
		// for (int i = 0; i <= 1000000; i++) {
		// s += i;
		// }
		// System.out.println(new Date());
	}
}
