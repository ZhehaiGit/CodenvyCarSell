
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository CstmRepository;
    
    public List<Course> getAllCar(String Username) {
        List<Car> cars = new ArrayList<>();
        CstmRepository.findByUsername(Username)
        .forEach(cars::add);
        return cars;
    }
    
    public Customer getCustomer(String id) {
        return CstmRepository.findOne(id);
    }
    
    public void addCustomer(Customer customer) {
        CstmRepository.save(customer);
    }
    
    public void updateCustomer(Customer customer) {
        CstmRepository.save(customer);
    }
    
    public void deletCustomer(Long id) {
        CstmRepository.delete(id);
    }
}