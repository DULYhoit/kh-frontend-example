
public class ArrayQueue<T> implements Queue<T> {
	private static final int DEFAULT_SIZE = 10;
	private Object[] queue = new Object[DEFAULT_SIZE];
	private int rear = -1;
	private int front = -1;
	@Override
	public void enqueue(T data) {
		if (isFull()) {
			System.out.println("full");
			return;
		}
		queue[++rear] = data;
	}

	private boolean isFull() {
		
		return rear == (DEFAULT_SIZE - 1);
	}

	@Override
	public T dequeue() {
	 if(isEmpty()) {
		 return null;
	 }
		front = ++front % DEFAULT_SIZE;
		return (T) queue[front];
	}

	private boolean isEmpty() {
		return rear == front;
	}

	

}
