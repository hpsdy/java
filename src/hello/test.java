package hello;

public class test {

	public volatile int q=10;
	public test() {
		System.out.println("i is test");
	}
	void one() {
		System.out.println("one");
	}
	protected synchronized void two() {
		System.out.println("two");
	}
 void three() {
		System.out.println("three");
	}
}

