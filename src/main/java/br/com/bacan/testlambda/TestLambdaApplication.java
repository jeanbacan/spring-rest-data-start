package br.com.bacan.testlambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestLambdaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestLambdaApplication.class, args);
		
		Thread threadTeste = new Thread(() -> {System.out.println(" Mah Oi Lambda ");});
		threadTeste.start();
		
	}
}

