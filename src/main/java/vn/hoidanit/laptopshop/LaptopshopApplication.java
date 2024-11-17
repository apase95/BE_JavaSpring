package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LaptopshopApplication {

	public static void main(String[] args) {
		Integer sumOfBean = 0;
		ApplicationContext beansList = SpringApplication.run(LaptopshopApplication.class, args);
		for (@SuppressWarnings("unused") String beans : beansList.getBeanDefinitionNames()) {
			++sumOfBean;
		}
		System.out.println(sumOfBean);
	}
}
