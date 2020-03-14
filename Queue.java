
public class Queue {
	    int front, rear, size;
	    String array[];
	    int capacity;
	    int count;

	    public Queue(int c) {
	        front = 0;
	        rear = -1;
	        size = 0;
	        capacity = c;
	        array = new String[c];
	    }

	    public String enqueue(String data) {
	        if (full()) {
	            System.out.println("queue is full");
	            System.exit(1);
	        } else {
	            rear++;
	            array[rear] = data;
	            size++;
	        }
	        return data;
	    }

	    public String dequeue(String data) {
	        if (isempty()) {
	            System.out.println("Queue is empty");
	            System.exit(1);
	        } else {
	            front++;
	            size--;
	        }
	        return "";
	    }

	    public void display() {
	        int i = front;
	        while (i <= rear) {
	            System.out.println(array[i]);
	            i++;
	        }

	    }

	    public boolean isempty() {
	        return (size() == 0);
	    }

	    public boolean full() {
	        return (size() == capacity);
	    }

	    public int size() {
	        return size;
	    }

	}


