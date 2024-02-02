package com.practice.todoapp.todowebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

//model - pass data to view
@Controller
@SessionAttributes("name")
public class WelcomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)        //Spring Security
    public String gotoWelcomePage(ModelMap model){
        model.put("name",getLoggedinUsername());
        return "welcome";
    }

    private String getLoggedinUsername(){
        Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String gotoLoginPage(){
//        return "login";
//    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){
//        if(authenticationService.authenticate(name,password)) {
//            model.put("name", name);
//            //Authentication
//            //name- abc
//            //password-dummy
//            return "welcome";
//        }
//            model.put("errorMessage", "Invalid Credentials! Please try again.");
//            return "login";
//
//    }

//    private Logger logger = LoggerFactory.getLogger(getClass());

//    @RequestMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, ModelMap model){
//        //System.out.println("Request param is "+ name); //Not recommended
////        logger.debug("request param is {}",name);  //logger.warn() & logger.info()
//        model.put("name",name);
//        return "login";
////    }

    //    private AuthenticationService authenticationService;
//
//    public WelcomeController(AuthenticationService authenticationService) {
//        this.authenticationService = authenticationService;
//    }



}
