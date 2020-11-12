import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		final List<String> list = new LinkedList<>();
        list.add("hi");
        list.add("bye");
        list.add("byebye");
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.remove(2);
	}

}
