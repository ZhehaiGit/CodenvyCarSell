package edu.infsci2560;

import edu.infsci2560.models.Car;
import edu.infsci2560.models.Customer;
import edu.infsci2560.models.Car.WorkoutType;
import edu.infsci2560.repositories.CarRepository;
import edu.infsci2560.repositories.CustomerRepository;

//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);
//    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAService");
//    public static EntityManager em = emf.createEntityManager();
    
    public static void main(String[] args) throws Exception {
        
        
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        CarRepository repository = ctx.getBean(CarRepository.class);
        repository.save(new Car(1L, "BMW X6", WorkoutType.SUV, "BMW $30K MIle:40K 90% new. If want ore info, pls conect me for free", "zzh@pitt.edu", "zzh"));
        repository.save(new Car(2L, "Benz c200", WorkoutType.NormalCar, "Benz","xjl@gmail.com", "xjl"));
        repository.save(new Car(3L, "Dodge Ram", WorkoutType.Van, "Dodge", "wdyj@ppp.com", "wdyj"));
        
        
        
        
//        em.getTransaction().begin();
        CustomerRepository CstmRepository = ctx.getBean(CustomerRepository.class);
        Customer c1 = new Customer( "zzh", "hzz", "zzh@pitt.edu");
//        em.persist(c1);
        
        List<Car> cars = c1.getCars();
        cars.add(new Car(1L, "BMW", WorkoutType.SUV, "BMWadasd","zzh@pitt.edu", "zzh"));
        cars.add(new Car(2L, "BMW3", WorkoutType.Van, "Van of Bmw","zzh@pitt.edu", "zzh"));
        c1.setCars(cars);
        
//        em.flush();
        CstmRepository.save(c1);
//        em.getTransaction().commit();
//        em.close();
//        emf.close();
        
        
//        CstmRepository.save(c1);
//        Customer c2 = new Customer( "xjl", "jlx", "xjl@gmail.edu");
//        CstmRepository.save(c2);
//        Customer c3 = new Customer( "wdyj", "dyjw", "wdyj@su.edu");
//        CstmRepository.save(c3);
//        Customer c4 = new Customer( "pw", "wp", "wp@su.edu");
//        CstmRepository.save(c4);
        
        
//        CustomerRepository CstmRepository = ctx.getBean(CustomerRepository.class);
//        Customer c1 = new Customer(  "zzh", "hzz");
////        c1.saveCar(new Car(1L, "BMW", WorkoutType.SUV, "BMWadasd","zzh@pitt.edu", "zzh"));
////        c1.saveCar(new Car(2L, "BMW3", WorkoutType.Van, "Van of Bmw","zzh@pitt.edu", "zzh"));
//        CstmRepository.save(c1);
//        Customer c2 = new Customer( "xjl", "jlx");
//        CstmRepository.save(c2);
//        Customer c3 = new Customer( "wdyj", "dyjw");
//        CstmRepository.save(c3);
//        Customer c4 = new Customer( "pw", "wp");
//        CstmRepository.save(c4);
    

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
