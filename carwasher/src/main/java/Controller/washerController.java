package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class washerController {
	@RestController
	public class LoginController {

		@RequestMapping("/hello")
		public String Hello() {
			return "Hello World 5";
		}

	}

}