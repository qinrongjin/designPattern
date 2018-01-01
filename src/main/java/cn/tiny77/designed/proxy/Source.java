package cn.tiny77.designed.proxy;

public class Source implements Sourceable {

	@Override
	public void method() {
		System.out.println("the original method!");  
	}

}
