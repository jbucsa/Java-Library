// Spring Boot Cloud provides an easy to manage Microservices. Users can upload application on Spring Cloud (Eureka) so that the application is scalable. The following code will enable Spring Cloud Services in the main application of Spring Boot. 


@SpringBootApplication
@EnableEurekaServer
public class DemoApplication{
    public static void main(String[] args){
        SpringApplication.run(DemoApplication.class, args);
    }
}