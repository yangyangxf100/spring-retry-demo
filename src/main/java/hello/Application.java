package hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class Application {

	public static void main(String[] args) throws Exception {
		ApplicationContext annotationContext = new AnnotationConfigApplicationContext("hello");
		RemoteService remoteService = annotationContext.getBean("remoteService", RemoteService.class);
		remoteService.call();
	}
} 