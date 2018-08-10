package java_projects;

class Queue_imp {
	private char[] q;
	private int getloc, putloc;

	Queue_imp(int qsize) {
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

public class QueueDemo_Improved {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Queue bigq = new Queue(26);

		// Example with bigq - To put characters.

		for (int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			if (ch != (char) 0) {
				bigq.put(ch);
				//System.out.println(bigq.get());
			}
		}
	
		// To Print bigq - To get characters
		for (int i = 0; i < 26; i++) {
			ch = (char) ('A' + i);
			if (ch != (char) 0) {
				System.out.println(bigq.get());
			}
			
		}
	
		
	}

}
