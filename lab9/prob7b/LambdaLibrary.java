package lab9.prob7b;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	public static final TriFunction<List<Employee>, Integer, Character, String> LIBRARYFUNCTION=(e,salary,charval)->
	e.stream()
	.filter((x)->x.salary>salary)
	.filter((x)->x.lastName.charAt(0)>charval)
	.map(x->x.firstName+" "+x.lastName)
	.sorted()
	.collect(Collectors.joining(", "));
	
}
