package example.spring.javaconfig;

import example.spring.javaconfig.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(example.spring.javaconfig.configs.AppConfig.class);
        ac.refresh();

        User user = (User)ac.getBean("user");
        user.setFullName("Ramesh Nayak");
        user.setCity("Hyderabad");
        user.setEmail("ramesh.rathlavath@ojas.com");
        //user.setPostalCode(pincode);

        System.err.println("USER DATA ->  "+user.toString());
    }
}
