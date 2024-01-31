package uz.pdp.autoconfig_based.controller;


import org.springframework.stereotype.Controller;
import uz.pdp.autoconfig_based.service.AService;

@Controller
public class AController {

    private final AService aService;

//    @Autowired
    public AController(AService aService) {
        this.aService = aService;
    }

    public void doSomething() {
        aService.print();
    }
}
