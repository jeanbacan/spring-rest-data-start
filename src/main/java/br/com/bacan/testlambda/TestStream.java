package br.com.bacan.testlambda;

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
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.net.SyslogOutputStream;

@SpringBootApplication
public class TestStream {

	public static void main(String[] args) {

		Stream<String> myStream = Stream.of("MA 1", "MA OI", "MA 3", "MA 4", "MA 5454");
		
		myStream.filter(s -> s.length() > 4).forEach(TestStream::print);
		
		//myStream.forEach(s -> System.out.println(s));
		
		
	}
	
	public static void print(String s){
		System.out.println(s);
	}
}

