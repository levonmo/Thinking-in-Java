package object3;

import java.util.ArrayList;
import java.util.Random;

public class RamdomList<T> {
	private ArrayList<T> storage = new ArrayList<T>();
	private Random rand = new Random(47);
	public void add(T item) {
		storage.add(item);
	}
	public T select() {
		return storage.get(rand.nextInt(storage.size()));
	}
	public static void main(String[] args) {
		RamdomList<String> randomlist = new RamdomList<String>();
		for (String s : "A,B,C,D,E,F,G".split(",")) {
			randomlist.add(s);
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(randomlist.select());
		}
	}
}
