package com.example.demo;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PorkemenController {

    private ArrayList<Porkemon> porkemonList;
    private Porkemon porkemonOne = new Porkemon("Carol",25);

    public PorkemenController() {
        porkemonList = new ArrayList<>();
        porkemonList.add(new Porkemon("Charmander",21));
        porkemonList.add(new Porkemon("Caterpie",22));
        porkemonList.add(new Porkemon("Metapod",23));

    }


    @GetMapping("/porkemonWorld")
    ArrayList<Porkemon> getPorkemon(){
        return porkemonList;
    }

    @PostMapping("/porkemonWorld")
    Porkemon post(@RequestBody Porkemon porkemon){
        porkemonList.add(porkemon);
        return porkemonList.get(porkemonList.size()-1);
    }

    @DeleteMapping("/porkemonWorld/{id}")
    void delete(@PathVariable int id){
        porkemonList.remove(id);
    }






}
