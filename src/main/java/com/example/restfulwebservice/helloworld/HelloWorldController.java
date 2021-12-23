package com.example.restfulwebservice.helloworld;

import com.example.restfulwebservice.helloworld.HelloWorldBean;
import com.example.restfulwebservice.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    //GET
    //uri: /hello-world(end-point)
    // @RequestMapping(method=RequestMethod.GET, path="/hello-world") //spring 4.0 (version에서는)
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello world");
    }

    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world, %s", name));
    }
}
