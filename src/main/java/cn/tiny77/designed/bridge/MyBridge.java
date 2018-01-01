package cn.tiny77.designed.bridge;

public class MyBridge extends Bridge {
	public void method() {
		getSource().method();
	}
}