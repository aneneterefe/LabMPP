package lab9.prob10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import lab9.prob7b.TriFunction;
import lab9.prob9.Dish;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	System.out.println("Query 1  : Print only Female canditates names");
	Stream.of(list).filter(x->x.gender.equals("Female")).map(x->x.getName()).forEach(System.out::println);
    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status 
	System.out.println("Query 2  : Cretae an objecy by choosing suitable Interface to the specified constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then print the object status");
	Function<String,Human> fun1=Human::new;
	BiFunction<String, Integer,Human> fun2= Human::new;
	TriFunction<String, Integer, String, Human> fun3= Human::new;
	Human[] list2 = { fun1.apply("Mark"), fun2.apply("Mark2", 22), fun3.apply("Mark3", 26, "Male")};
	Stream.of(list2).forEach(System.out::println);
	// Query 3 : Count the male candidates whose age is more than 30
    System.out.println("Query 3 : Count the male candidates whose age is more than 30");
    System.out.println(Stream.of(list).filter(x->x.age>30).filter(x->x.gender=="Male").count());
    
   }



}
