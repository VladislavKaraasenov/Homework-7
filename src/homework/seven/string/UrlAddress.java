package homework.seven.string;

public class UrlAddress {

	private String urlAddress;
	private String protocol;
	private String server;
	private String resource;

	public UrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}

	public String getUrlAdres() {
		return urlAddress;
	}

	public void setUrlAdres(String urlAdres) {
		this.urlAddress = urlAdres;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public void protocolServerResource() {
		String[] url = this.urlAddress.split("://+");
		String protocol = url[0];
		int index = url[1].indexOf("/");
		String server = url[1].substring(0, index);
		String resource = url[1].substring(index);

		this.protocol = protocol;
		this.server = server;
		this.resource = resource;

	}

	@Override
	public String toString() {
		return "Protocol = " + this.protocol + "\n" + "Server = " + this.server + "\n" + "Resource = " + this.resource;
	}

}
