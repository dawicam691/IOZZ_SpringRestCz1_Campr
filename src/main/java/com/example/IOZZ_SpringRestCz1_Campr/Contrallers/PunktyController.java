package com.example.IOZZ_SpringRestCz1_Campr.Contrallers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@RestController
@RequestMapping("/punkty")
public class PunktyController {
    private List<String> users = new CopyOnWriteArrayList<String>(new ArrayList<String>());
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<String> getUsers(){
        /*
        List<String> usersList = new ArrayList<String>();
        usersList.add("Użytkowik1");
        usersList.add("Użytkowik2");
        usersList.add("Użytkowik3");
        usersList.add("Użytkowik4");
        usersList.add("Użytkowik5");
        usersList.add("Użytkowik6");
        return usersList;
        */
        /*
        users.add("Jan Nowak");
        users.add("Anna Kowalska");
        users.add("Jerzy Baran");
        */

        return users;
    }
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody String user){
        users.add(user);
    }
}
