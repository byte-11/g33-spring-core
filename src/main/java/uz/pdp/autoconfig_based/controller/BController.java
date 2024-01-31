package uz.pdp.autoconfig_based.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import uz.pdp.autoconfig_based.service.AService;
import uz.pdp.autoconfig_based.service.BService;

@Controller
public class BController {

    @Autowired
    private BService bService;

    private AService aService;


    @Autowired
    public void setAService(AService aService) {
        this.aService = aService;
    }
}
