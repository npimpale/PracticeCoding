package com.synechron.aqr.nikhil;

public class MyQueue {
	private Object[] queue;;
	private int head = -1;
	private int tail = -1;

	public MyQueue(Object[] queue) {
		this.queue = queue;
	}

	public static void main(String args[]) {
		MyQueue queue = new MyQueue(new Object[5]);
		try {
			queue.enqueue(11);
			queue.enqueue(22);
			queue.enqueue(33);
			queue.enqueue(44);
			queue.enqueue(55);
			queue.enqueue(66);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void enqueue(Object s) throws Exception {
		if (tail < queue.length - 1) {
			tail++;
			queue[tail] = s;
			System.out.println(queue[tail]);
		} else {
			throw new Exception("Queue full!!");
		}
	}

	public Object dequeue() throws Exception {
		Object s = null;
		if (head < tail) {
			head++;
			s = queue[head];
			queue[head] = null;
		} else {
			throw new Exception("Queue empty!!");
		}
		return s;
	}
}
