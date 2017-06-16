package homework.seven.string;

public class TaskTwo {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("The code between <upcase> a special tag </upcase> is always <upcase> uppercase </upcase>");
		int index = sb.indexOf("<upcase>");
		int index2 = sb.indexOf("</upcase>");
		
		while (index != -1) {
			String text = sb.substring(index + 9, index2);
			String newText = text.toUpperCase();
			sb.replace(index, index2 + 10, newText);

			index = sb.indexOf("<upcase>", index + 1);
			index2 = sb.indexOf("</upcase>", index2 + 1);
		}

		System.out.println(sb.toString());
	}
}
