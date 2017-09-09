package object;

//final¿‡
public class Jursaaic /*extends Dinosaur*/ {

	public static void main(String[] args) {
		Dinosaur dinosaur = new Dinosaur();
		dinosaur.f();
		dinosaur.i = 40;
		dinosaur.j++;
	}
	
}
class SmallBrain {}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain smallBrain = new SmallBrain();
	public void f() {}
}
