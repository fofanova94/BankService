package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController

public class Controller {
 /*   @Autowired
    FileUsersStorage fileUsersStorage;

    @Autowired
    BankRepository bankRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public User showUser(){
        return new User("Ivan" , 45, "Moscow");
    }


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String addUser(@RequestBody User user){
        fileUsersStorage.addUsers(user);
        return "ok";
    }

    @RequestMapping (value = "/head", method = RequestMethod.GET)
    public String showHeader(@RequestHeader Map<String,String>map){
        map.forEach((k,v)-> System.out.println("key "+ k +" value "+ v));
        return "ok";
    }

    @RequestMapping (value = "/m",method = RequestMethod.GET)

    public String addParams (@RequestParam String name,@RequestParam String age){
        System.out.printf("name parameter is %s age is %d",name,age);
        return "ok";
    }

    @RequestMapping (value = "/showusers",method = RequestMethod.GET)
    public ArrayList<BankCardsInformation> getUsers(){

        ArrayList<BankCardsInformation> users = bankRepository.findAll();
        return users;

    }
*/
}
