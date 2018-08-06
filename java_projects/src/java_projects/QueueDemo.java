package java_projects;

class Queue {
	char[] q;
	int getloc, putloc;

	Queue(int qsize) {
		getloc = putloc = 0;
		q = new char[qsize];
	}

	char get() {
		if (getloc == putloc) {
			System.out.println("Sorry queue is empty , nothing to retrieve");
			return (char) 0;
		}
		return q[getloc++];

	}

	void put(char input_ch) {
		if ((putloc == q.length) && ((getloc-1)==putloc)) {
			System.out.println("Sorry Queue is full, can't write anymore data");
			return;
		}
		q[putloc++] = input_ch;
		
	}
}

public class QueueDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Queue bigq = new Queue(128);

		// Example with bigq - To put characters.

		for (int i = 0; i < 128; i++) {
			ch = (char) ('A' + i);
			if (ch != (char) 0) {
				bigq.put(ch);
				//System.out.println(bigq.get());
			}
		}
	
		// To Print bigq - To get characters
		for (int i = 0; i < 128; i++) {
			ch = (char) ('A' + i);
			if (ch != (char) 0) {
				System.out.println(bigq.get());
			}
		}
	
		
	}

}
