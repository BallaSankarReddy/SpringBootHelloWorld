
package com.padma.SpringBootHellWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringJava4sController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Spring Boot Tutorials";
	}
	
	@GetMapping("/hello")
	public String myData() {
		return "Hello Spring Boot";
	}
}

