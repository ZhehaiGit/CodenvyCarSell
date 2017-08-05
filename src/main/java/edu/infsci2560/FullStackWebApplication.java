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
        
         repository.save(new Car(1L, "2013 Porsche 911", 
                                WorkoutType.Coupe, 
                                "This Certified 2013 Porsche 911 is a brilliant example of quality meets",
                                "Zhehai@gmail.com", 
                                "Zhehai"));
        repository.save(new Car(14L, "2013 Porsche 911", 
                                WorkoutType.Coupe, 
                                "This Certified 2013 Porsche 911 is a brilliant example of quality meets reliability. This vehicle has been thoroughly inspected and has an assured quality that you won't find with other vehicles. If you are looking for a pre-owned vehicle that looks brand-new, look no further than this Platinum Silver Metallic Porsche 911. In addition to unbelievable options, this vehicle comes equipped with a factory warranty. You will never have to worry about keeping up with traffic in this Porsche 911 as it packs a beast under the hood. This Porsche 911 offers the most up-to-date navigation system available so you'll always know the most efficient route to where you are going. We are proud to offer this 2013 Porsche that truly a must-have. This vehicle's wheels are one of the many attractive features that this 911 has to offer. Take this car on a test drive today, only at Auto Palace.",
                                "Zhehai@gmail.com", 
                                "Zhehai"));
        repository.save(new Car(15L, "2016 Mercedes-Benz G-Class AMG G63", 
                                WorkoutType.SUV, 
                                "AWD, CarFax One Owner! Low miles for a 2016! Navigation, Back-up Camera, Bluetooth, Cooled Seats, Heated Seats, Multi-Zone Air Conditioning, Auto Climate Control, Leather Steering Wheel Satellite Radio, Steering Wheel Controls, Sunroof/Moonroof, HD Radio Aux Audio Input, Seating, Automatic Headlights Parking Sensors AM/FM Radio Rain Sensing Wipers Premium Sound System Multi-Point Inspection, Park Distance Control Turbocharged, Stability Control, ABS Brakes Satellite Radio Please let us help you with finding the ideal New, Preowned, or Certified vehicle.",
                                "KivenL@gmail.com", 
                                "Kiven"));                        
                                
        repository.save(new Car(3L, "2014 Nissan Titan King Cab, 4x2, SV", 
                                WorkoutType.Truck, 
                                "This Nissan Titan is equipped with, AM/FM/CD Audio System,Driver door bin,Driver vanity mirror,Dual front impact airbags,Dual front side impact airbags,Front wheel independent suspension,Occupant sensing airbag,Overhead airbag,Passenger door bin,Passenger vanity mirror,Power steering,Rear step bumper,Speed-sensing steering,Split folding rear seat,Tilt steering wheel,Traction control,Variably intermittent wipers,Speed-Sensitive Wipers,Rear seats: split-bench,CD player,Brake assist,Anti-whiplash front head restraints,AM/FM radio,ABS brakes,Tachometer,Electronic Stability Control,Air Conditioning,6 Speakers,4-Wheel Disc Brakes Come visit us at www.dallasmetroauto.com or call us at (214)518-0043",
                                "Zhehai@gmail.com", 
                                "Zhehai"));
        repository.save(new Car(4L, "2014 Porsche Panamera", 
                                WorkoutType.Sedan, 
                                "2014 Porsche Panamera . 345 - Steering wheel heating 350 - Adaptive Air Suspension incl. PASM 415 - 19 Panamera Turbo Wheels 458 - Lane Departure Warning (LDW) 541 - Seat Ventilation (Front) 602 - LED headlights incl. Porsche Dynamic Light System Plus (PDLS Plus) 638 - ParkAssist (Front and Rear) incl. Reversing Camera 885 - Soft Close doors A1 - Black AB - Standard Interior in Black P40 - BOSE Audio Package P45 - Premium Package Plus P80 - 14-way Power Seats with Memory",
                                "WilliamWang@163.com", 
                                "William"));                       
         
         repository.save(new Car(5L, "2015 Porsche Cayenne", 
                                WorkoutType.SUV, 
                                "This is a well kept ONE-OWNER Porsche Cayenne Diesel with a full CARFAX history report. Navigate through all the icky weather with ease in this AWD-equipped Porsche Cayenne, and even get non-stop traction for your non-stop lifestyle! In addition to the amazing traction control, you may even qualify for an insurance reduction with this AWD vehicle. All records are included with the purchase of this well-maintained pre-owned vehicle. This pre-owned Porsche Cayenne looks like new with a clean interior that's been well-kept. Stand out from the crowd as a 2015 Porsche Cayenne Diesel is a rare find and just may attract paparazzi. Take this car on a test drive today, only at Auto Palace.",
                                "WilliamWang@qq.com", 
                                "William"));    
        repository.save(new Car(6L, "2015 Porsche Cayenne", 
                                WorkoutType.SUV, 
                                "This is a well kept ONE-OWNER Porsche Cayenne Diesel with a full CARFAX history report. Navigate through all the icky weather with ease in this AWD-equipped Porsche Cayenne, and even get non-stop traction for your non-stop lifestyle! In addition to the amazing traction control, you may even qualify for an insurance reduction with this AWD vehicle. All records are included with the purchase of this well-maintained pre-owned vehicle. This pre-owned Porsche Cayenne looks like new with a clean interior that's been well-kept. Stand out from the crowd as a 2015 Porsche Cayenne Diesel is a rare find and just may attract paparazzi. Take this car on a test drive today, only at Auto Palace.",
                                "SamWh@gmail.com", 
                                "SamWh")); 
        repository.save(new Car(7L, "Chevrolet Corvette Z06", 
                                WorkoutType.Coupe, 
                                "This 2016 Chevrolet Corvette comes with a CARFAX Buyback Guarantee, which means you can buy with certainty. Opulent refinements married with exceptional engineering make this the kind of car you'll want to own for a lifetime. This is your chance to own the very rare Chevrolet Corvette. Feel pleased in your decision to buy this Chevrolet Corvette as it's still covered under the manufacturer's warranty. When this vehicle was shipped from the factory, Chevrolet decided that no option should be left off of this magnificent automobile. So, if you're in the market for a Chevrolet Corvette Z06 3LZ that is equipped with copious amounts of options, then we may just have the perfect vehicle to suit your needs. A simple firing of the ignition is all you need to know this baby has speed. The kind that is supercharged with adrenaline. This pre-owned Chevrolet Corvette looks like new with a clean interior that's been well-kept. There is no evidence of prior damage or paintwork on this Chevrolet Corvette Z06 3LZ. The upgraded wheels on this Chevrolet Corvette offer an improved ride and an attractive accent to the vehicle. Take this car on a test drive today, only at Auto Palace.",
                                "SatoChen@gamil.com", 
                                "Sato"));
        repository.save(new Car(8L, "Land Rover Range Rover Sport Supercharged", 
                                WorkoutType.SUV, 
                                "This Land Rover includes: AUTOBIOGRAPHY PKG HD Radio Aluminum Wheels Back-Up Camera Woodgrain Interior Trim Leather Seats LUNAR/EBONY, 2-TONE LEATHER SEATING SURFACES Leather Seats BLACK LACQUER WOOD TRIM Woodgrain Interior Trim INDUS SILVER METALLIC *Note - For third party subscriptions or services, please contact the dealer for more information.* How to protect your purchase? CARFAX BuyBack Guarantee got you covered. This is a well kept ONE-OWNER Land Rover Range Rover Sport SC Autobiography with a full CARFAX history report. On almost any road condition, this Land Rover Range Rover Sport SC Autobiography offers solid performance, reliability, and comfort. There's a level of quality and refinement in this Land Rover Range Rover Sport that you won't find in your average vehicle. Simply put, this Four Wheel Drive is engineered with higher standards. Enjoy improved steering, superior acceleration, and increased stability and safety while driving this 4WD Land Rover Range Rover Sport SC Autobiography. This 2013 Land Rover Range Rover Sport has such low mileage you'll probably think of them more as blocks traveled than miles traveled. This pre-owned Land Rover Range Rover Sport looks like new with a clean interior that's been well-kept. High performance is what this vehicle is all about. You will be reminded of that every time you drive it. Class defining, one-of-a-kind options are the standard with this Land Rover Range Rover Sport plus much, much more. Marked by excellent quality and features with unmistakable refined leather interior that added value and class to the Land Rover Range Rover Sport With new tires, this vehicle is ready for miles and miles of driving. This Land Rover Range Rover Sport SC Autobiography has a flawless finish that complements its wonderful interior. You'll instantly stand out with this hard-to-find 2013 Land Rover Range Rover Sport SC Autobiography. Be sure to prepare yourself to get noticed in this ultra rare Land Rover Range Rover Sport. This Land Rover Range Rover Sport comes equipped with hard-to-find custom wheels. Take this car on a test drive today, only at Auto Palace.",
                                "SatoChen@yahoo.com", 
                                "Sato"));
        repository.save(new Car(9L, "2005 Ford GT", 
                                WorkoutType.SUV, 
                                "This is a one owner Ford GT that came out of a private 50 car, car collection and sits in our collection. We have all the stickers and books that came whit this 4 option GT, we even have the car cover. We have sold over 20 Ford GT's in the last few years and this is the nicest we have seen. Call with any questions or offers.",
                                "AmyM1998@gmail.com", 
                                "Amy"));
        repository.save(new Car(10L, "1998 Porsche 911 Carrera", 
                                WorkoutType.Convertible, 
                                "Wow here is a chance to own one of the most desirable collectors cars on the market! These air cooled Porsche are doing nothing but appreciating in value. You can feel comfortable buying a collector car as nice as this from a factory authorized Porsche dealer! We have to Certificate of Authenticity for this car, here are the options, Motor Sound Package, Full Power Seat-Left, 4 Rim Caps w/ Porsche Crest. HiFi Sound System, AM/FM w CD Player, Tiptronic Transmission, Leather Trey Behind Parking Break, and 2 Leather Inside Door Openers. We have gone through the entire car and replaced any faulty parts. We pulled the engine and did a complete reseal, new tie rods and rear track rods, a full check of the suspension and alignment, all maintenance is up to date, transmission serviced, all bulbs, lights, and gauges work as they should from the factory. There is nothing this car needs. Certified Porsche technicians performed all work.",
                                "HelenGeorgia@163.com", 
                                "Helen"));
        repository.save(new Car(11L, "2010 Ferrari California", 
                                WorkoutType.Convertible, 
                                "If you're looking for a great pre-owned convertible, look no further. This exceptional car has all the features you want. Sophistication & understated luxury comes standard on this Ferrari California . Well-known by many, the California has become a household name in the realm of quality and prestige. This vehicle has extremely low miles on the odometer, so while it's pre-owned, it's practically new. Marked by excellent quality and features with unmistakable refined leather interior that added value and class to the Ferrari California Take the guesswork out of where you are going with the top-tier navigation system found on this exceptional Ferrari California. All records are included with the purchase of this well-maintained pre-owned vehicle. If not for a few miles on the odometer you would be hard-pressed to know this 2010 Ferrari California is a pre-owned vehicle. This 2010 Ferrari is a unique find - pair it with a Rear Entertainment Package and you have hit the jackpot. Stupendously fast, yet subtle at the same time, this Ferrari California sets the bar high. A true automotive masterpiece, this Ferrari can function on track-day or work-day, and will always get you to your destination very quick. You'll enjoy improved traction and world-class handling thanks to the new tires on this vehicle. If you're looking for a one-of-a-kind automobile, look no further. Upgraded wheels enhance the look of this Ferrari California. More information about the 2010 Ferrari California: Ferrari's 2010 California fills dual roles as a both a grand tourer and an open 2-seater. It also serves as a showcase not only for Ferrari racing technology but for the elegance of design and luxury drivers have come to expect from the Maranello marquee. Staggering performance combined with an exclusive price tag, the California has very little in the way of competition on the street. This model sets itself apart with potent 4.3-liter V8, Sexy styling with slick retractable hardtop, world-class performance and handling, and dual-clutch paddle-shift transmission Take this car on a test drive today, only at Auto Palace.",
                                "AnneHathaw@gmail.com", 
                                "Anne"));
        repository.save(new Car(2L, "2011 Chevrolet Camaro SS", 
                                WorkoutType.Coupe, 
                                "CARFAX BuyBack Guarantee got you covered. A Chevrolet with as few miles as this one is a rare find. This Chevrolet Camaro 1SS was gently driven and it shows. High-performance tires are another option found on this vehicle. A vehicle as well-maintained as this Chevrolet Camaro almost doesn't need a warranty, but you rest easier knowing it comes covered with the Chevrolet factory warranty. The interior of this Chevrolet Camaro 1SS has been through meticulous inspection and could almost pass for a brand new vehicle. Take this car on a test drive today, only at Auto Palace.",
                                "AdamShul@gmail.com", 
                                "Adam"));
        repository.save(new Car(12L, "2006 Buick Terraza 4dr CXL AWD", 
                                WorkoutType.Van, 
                                "This 2006 Buick Terraza CXL looks and drives great. Clear title and Autocheck report. Rust free vehicle. Local N. TX franchise dealer new car trade. CLX package. 3rd row seat, only 56K and still in excellent mechanical/body/interior condition. Fully loaded power windows, lock, mirrors, steering controls, cruise control, digital clock, very nice leather interior, 3rd raw seating, Non smoker, driver/passenger airbags, cold air, factory premium sound with CD/DVD player, luggage rack, tinted windows, factory wheels, and more. Books and records. Strong 3.5 L 6 CYL engine with automatic transmission. 23 MPG. Ready to show. Serviced by AJ's Nice Cars. You are gonna love the way you look in this 2006 Buick Terraza CXL. I GUARANTEE IT. MUST SEE + over 150 beautiful vehicles in stock at www.ajsnicecars.com . Please note: Some disclaimers and descriptions/options maybe mistakenly posted. Buyers please to make sure of all are accurate. Extended warranties available on most cars. We welcome all 3rd party inspections. Praise the LORD. All cars at AJ's Nice Cars can be financed in house with 0% interest upon purchasing an extended warranty agreement/service contract at a cost of only $100.00 per month. This agreement will allow our in house financed customers: Free oil changes Free tire rotations Free Diagnostics/check ups Also 20% discount on parts and labor to all repairs performed at AJ's Nice Cars Service Department.",
                                "Zhehai@gmail.com", 
                                "Zhehai"));
                                
        
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
