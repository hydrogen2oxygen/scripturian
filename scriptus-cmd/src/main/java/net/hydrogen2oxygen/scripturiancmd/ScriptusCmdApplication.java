package net.hydrogen2oxygen.scripturiancmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ScriptusCmdApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ScriptusCmdApplication.class, args);
	}
}
