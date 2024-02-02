package com.practice.todoapp.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class SayHelloController {
    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello, How are you?";
    }

    @RequestMapping("/say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){

        StringBuffer sb= new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first HTML Page</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My data");
        sb.append("</body>");
        sb.append("</html>");


        return sb.toString();
    }
    //"F:\Old Data\Personal\Springboot Personal\todowebapp\src\main\resources\META-INF\resources\WEB-INF\jsp\sayHello.jsp"
    //"src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp"
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
