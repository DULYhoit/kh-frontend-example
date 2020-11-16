
public class StackNode {
	private String data;
	private StackNode link;

	public StackNode() {
		this.data = null;
		this.link = null;
	}
	public StackNode(String data) {
		this.data = data;
		this.link = null;
	}
	public StackNode(String data, StackNode link) {
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return this.data;
	}

}
