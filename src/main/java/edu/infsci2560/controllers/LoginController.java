@Controller
public class CarsController {
    @Autowired
    private CustomerRepository cstmRepository;
    final static Logger log = LoggerFactory.getLogger(CarsController.class);
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public ModelAndView index() {
        return new ModelAndView("cars", "cars", repository.findAll());
    }
    
    @RequestMapping(value = "sellcars", method = RequestMethod.GET)
    public ModelAndView SellCars() {
        return new ModelAndView("sellcars", "cars", repository.findAll());
    }
    @RequestMapping(value = "removecar", method = RequestMethod.GET)
    public ModelAndView removecar() {
        return new ModelAndView("removecar", "cars", repository.findAll());
    }
    
    @RequestMapping(value = "sellcarsadd", method = RequestMethod.POST, consumes="application/x-www-form-urlencoded", produces = "application/json")
    public ModelAndView create(@ModelAttribute @Valid Car car, BindingResult result) {
        repository.save(car);
        return new ModelAndView("sellcars", "cars", repository.findAll());
    }