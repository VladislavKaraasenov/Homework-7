package homework.seven.string;

public class TaskThreeDemo {
	public static void main(String[] args) {

		UrlAddress urlAddress = new UrlAddress("http://www.google.com/path/to/resource?arg=1");
		urlAddress.protocolServerResource();
		System.out.println(urlAddress.toString());

		System.out.println("----------");

		urlAddress.setUrlAdres("https://www.youtube.com/watch?v=hHwPESc-O8c");
		urlAddress.protocolServerResource();
		System.out.println(urlAddress.toString());

	}
}
