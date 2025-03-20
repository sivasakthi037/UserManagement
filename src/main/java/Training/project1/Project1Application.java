package Training.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "Training.project1.entity")
public class Project1Application {
	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
	}
}
