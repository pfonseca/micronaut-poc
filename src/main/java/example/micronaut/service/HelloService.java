package example.micronaut.service;

import example.micronaut.entity.HelloDto;

import javax.inject.Singleton;

@Singleton
public class HelloService {

    public HelloDto getHelloMessage() {

        HelloDto helloDto = new HelloDto();
        helloDto.setAge(12);
        helloDto.setName("Paulo Vitor");
        helloDto.setLastName("Mira Fonseca");

        return helloDto;
    }
}
