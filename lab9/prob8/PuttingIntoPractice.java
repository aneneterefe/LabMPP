package lab9.prob8;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
		System.out.println("Query 1:");
		transactions.stream()
			.filter((x)->x.getYear()>2011)
			.sorted(Comparator.comparingInt(Transaction::getValue)).forEach(System.out::println);
        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Query 2:");
        System.out.println(transactions.stream()
        	.map((x)->x.getTrader().getCity())
        	.distinct()
        	.collect(Collectors.joining(", ")));

        // Query 3: Find all traders from Cambridge and sort them by name.
        System.out.println("Query 3:");
		transactions.stream()
			.filter((x)->x.getTrader().getCity().equals("Cambridge"))
			.sorted(Comparator.comparing(x->x.getTrader().getName())).forEach(System.out::println);
        	
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println("Query 4:");
		System.out.println(transactions.stream()
			.map(x->x.getTrader().getName()).distinct()
			.sorted().collect(Collectors.joining(", ")));
        	

      // Query 5: Are there any trader based in Milan?
		System.out.println("Query 5:");
		System.out.print(
				transactions.stream()
				.anyMatch(x->x.getTrader().getCity().equals("Milan"))
				);
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		System.out.println("Query 5:");
		transactions.stream()
					.filter(x->x.getTrader().getCity().equals("Milan"))
					.forEach(x->x.getTrader().setCity("Cambridge"));
		System.out.println(transactions);
        
        
        // Query 7: What's the highest value in all the transactions?
		System.out.println("Query 5:");
		System.out.println(transactions.stream()
					.map(x->x.getValue())
					.reduce(0,Integer::max));

}
