package cn.tiny77.designed.decorator;

public class DecoratorTest {

	public static void main(String[] args) {
		Decorator decorator = new Decorator(new Source());
		decorator.method();
	}

}
