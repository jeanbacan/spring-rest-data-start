package br.com.bacan.testlambda;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestLambdaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestLambdaApplication.class, args);
		
		Thread threadTeste = new Thread(() -> {System.out.println(" Mah Oi Lambda ");});
		threadTeste.start();
		
		
		//Receive Parameter and return a parameters
		Function<String, String> myFunctionLambda;
		
		//We going to find out what this does
		Predicate<String> myPredictableLambda;

		//Int param and int return
		IntPredicate intPredicate;
		
		//Just return a value, create objects with no parameter
		Supplier<String> mySupplierLambda = () -> new String("iuh");
		System.out.println(mySupplierLambda.get());
		
		Supplier<BufferedReader> mySupplierLambda2 = () -> { 
			
			try(BufferedReader reader = Files.newBufferedReader(Paths.get("C:/"))){
				return reader;
			}catch (IOException e) {
				e.printStackTrace();
			};
			return null;
		};
		System.out.println(mySupplierLambda2.get());
		
		Supplier<BufferedReader> mySupplierLambda3 = () -> {
			
			BufferedReader read = null;
			try {
				read = new BufferedReader(new FileReader(""));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return read;
		};
		System.out.println(mySupplierLambda3.get());
		
		//To use in forEach operations
		Consumer<String> myConsumerLambda;		
		
		String[] murray = new String[] {"Jean", "Bacan"};
		
		TestLambdaApplication a = new TestLambdaApplication();
		Arrays.sort(murray, String::compareToIgnoreCase);
		
		System.out.print(murray[0]);
		System.out.print(murray[1]);
		
		Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
		
		anagrams.put("iuhuiH", new ArrayList<>());
		
		
//		IntUnary
		
//		BiFunction
	}
	
	public int comp(String a, String b){
		return a.compareTo(b);
	}
}

