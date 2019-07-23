package example.micronaut.controller;

import example.micronaut.entity.HelloDto;
import example.micronaut.service.HelloService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {

    @Inject
    private HelloService helloService;


    @Get
    public HelloDto index() {
        return helloService.getHelloMessage();
    }
}
