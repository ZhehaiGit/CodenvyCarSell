package edu.infsci2560;

import edu.infsci2560.models.Car;
import edu.infsci2560.models.Customer;
import edu.infsci2560.models.Car.WorkoutType;
import edu.infsci2560.repositories.CarRepository;
import edu.infsci2560.repositories.CustomerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        CarRepository repository = ctx.getBean(CarRepository.class);
        repository.save(new Car(1L, "BMW X6", WorkoutType.SUV, "BMW", "zzh@pitt.edu", "zzh"));
        repository.save(new Car(2L, "Benz c200", WorkoutType.NormalCar, "Benz","xjl@gmail.com", "xjl"));
        repository.save(new Car(3L, "Dodge Ram", WorkoutType.Van, "Dodge", "wdyj@ppp.com", "wdyj"));
        
//        CustomerRepository CstmRepository = ctx.getBean(CustomerRepository.class);
//        CstmRepository.save(new Customer( "zzh", "hzz"));
//        CstmRepository.save(new Customer( "xjl", "jlx"));
//        CstmRepository.save(new Customer( "wdyj", "dyjw"));
    

//        CustomerRepository CstmRepository = ctx.getBean(CustomerRepository.class);
//        CstmRepository.save(new Customer( "zzh", "hzz", "zzh@pitt.edu"));
//        CstmRepository.save(new Customer( "xjl", "jlx", "xjl@gmail.edu"));
//        CstmRepository.save(new Customer( "wdyj", "dyjw", "wdyj@su.edu"));
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
}
