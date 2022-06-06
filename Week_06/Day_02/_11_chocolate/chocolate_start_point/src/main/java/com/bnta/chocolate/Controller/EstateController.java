package com.bnta.chocolate.Controller;

import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstateController {

    @Autowired
    private EstateRepository estateRepository;

    @GetMapping("/estate")
    public List<Estate> getAll(){
        return estateRepository.findAll();
    }

}
