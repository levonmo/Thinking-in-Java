package object2;

public class Music5 {
	static void tune(Instrument1 i) {
		i.play();
	}
	static void tune(Instrument1[] arr) {
		for (Instrument1 i : arr) {
			i.play();
		}
	}
	public static void main(String[] args) {
		Instrument1[] arr = {new Wind1(),new Percussion1(),new Stringed1(),new Woodwind1(),new Brass1()};
		tune(arr);
	}
}
interface Instrument1 {
	int value = 5;
	void play();
	void adjust();
}
class Wind1 implements Instrument1 {
	public void play() {System.out.println("Wind.play");}
	public void adjust() {System.out.println("Wind1.adjust");}
}
class Percussion1 implements Instrument1 {
	public void play() {System.out.println("Percussion1.play");}
	public void adjust() {System.out.println("Percussion1.adjust");}
}
class Stringed1 implements  Instrument1 {
	public void play() {System.out.println("Stringed1.play");}
	public void adjust() {System.out.println("Stringed1.adjust");}
}
class Woodwind1 extends Wind1 {
	public void play() {System.out.println("Woodwind.play");}
	public String what() {return "Woodwind1.what";}
}
class Brass1 extends Wind1 {
	public void play() {System.out.println("Brass1.play");}
	public void adjust() {System.out.println("Brass1.adjust");}
}