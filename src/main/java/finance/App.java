package finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import quickfix.ConfigError;

@SpringBootApplication

public class App {

        public static void main(String[] args)  throws ConfigError {
            SpringApplication.run(App.class, args);

        }
}
