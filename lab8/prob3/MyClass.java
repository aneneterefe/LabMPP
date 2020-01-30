package lab8.prob3;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyClass {
	
	private int x;
	private String y;
	public MyClass(int x, String y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	
	public void mymethod(MyClass cls) {
		Function<MyClass, Boolean> fun=this::equals;
		System.out.println(fun.apply(cls));
	}
	
	@Override
	public boolean equals(Object o) {
		if(o==null)
			return false;
		if(o.getClass()!=this.getClass())
			return false;
		MyClass ocls=(MyClass)o;
		return (ocls.x==this.x&&ocls.y.equals(this.y));
	}
	
	public static void main(String[] args) {
		MyClass m=new MyClass(1, "xx");
		MyClass m2=new MyClass(1, "xx");
		MyClass m3=new MyClass(2, "ds");
		m.mymethod(m2);
		m.mymethod(m3);
	}
}
