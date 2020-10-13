package animal;

public class Duck extends Animal {
	@Override
	public void speak() {
		System.out.println("~ 꽦!꽦!");
	}
	@Override
	public void walk() {
		System.out.println("[두발로걷는다]");
	}
}
