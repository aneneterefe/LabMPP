package lab8.prob4;

import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i)
		System.out.println("i)---using method reference");
		Supplier<Double> s=Math::random;
		System.out.println(s.get());
		
		//ii)
		System.out.println("ii)---using lambdda");
		Supplier<Double> s2=()->Math.random();
		System.out.println(s2.get());
		
		//iii)
		
		class MyClass implements Supplier<Double>{

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
			
		}
		System.out.println("iii)---using method inner class");
		MyClass mc=new MyClass();
		System.out.println(mc.get());
	}

}
