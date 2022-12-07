package j20_함수형인터페이스;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class test {
	private List<String> list = new ArrayList<>();
	
	public void method1() {
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	public void method2(Consumer<String> consumer) {
		for (String s : list) {
			consumer.accept(s);
		}
	}
	

}
