package com.bnta.chocolate.Controller;


import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChocolateController {

    @Autowired
    private ChocolateRepository chocolateRepository;

    @GetMapping("/chocolate")
    public List<Chocolate> getAll(){
        return chocolateRepository.findAll();
    }






}
