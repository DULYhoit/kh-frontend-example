import java.util.Arrays;

public class DoublyLinkedList<T> implements Stack<T> {

	private static final int DEFAULT_SIZE = 5;

	private Object[] array = new Object[DEFAULT_SIZE];
	private int top = 0;
	private int currentCapacity = DEFAULT_SIZE;

	@Override
	public void push(T value) {
		ensureCapacity();
		array[top++] = value;
	}

	private void ensureCapacity() {
		// 1. �迭�� ��á���� �˻�
		if (top >= DEFAULT_SIZE) {
			// 2. ���� ��� �迭�� �ø�
			array = Arrays.copyOf(array, currentCapacity * 2);
			// 3. ���� �ִ� �뷮 �� �ø�
			currentCapacity *= 2;
		}
	}

	@SuppressWarnings("unchecked") // ��.
	@Override
	public T pop() {
		if (top <= 0) {
			return null;
		}
		top -= 1;
		final Object result = array[top];
		array[top] = null;
		return (T) result;
	}

	@Override
	public boolean isEmpty() {
		return array[0] == null;
	}
}
