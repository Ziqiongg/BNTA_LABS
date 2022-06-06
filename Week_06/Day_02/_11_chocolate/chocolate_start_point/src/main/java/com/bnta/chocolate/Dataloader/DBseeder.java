package com.bnta.chocolate.Dataloader;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DBseeder implements ApplicationRunner {

    @Autowired
    private EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Estate e1 = new Estate("eOne","England");
        Estate e2 = new Estate("eTwo","Scotland");
        Estate e3 = new Estate("eThree","America");
        Estate e4 = new Estate("eFour","Canada");

        Chocolate c1 = new Chocolate("cOne",10,e1);
        Chocolate c2 = new Chocolate("cTwo",20,e1);
        Chocolate c3 = new Chocolate("cThree",30,e2);
        Chocolate c4 = new Chocolate("cfour",40,e2);
        Chocolate c5 = new Chocolate("cFive",50,e3);
        Chocolate c6 = new Chocolate("cSix",60,e3);
        Chocolate c7 = new Chocolate("cSeven",70,e4);
        Chocolate c8 = new Chocolate("cEight",80,e4);

        e1.setChocolates(List.of(c1,c2));
        e2.setChocolates(List.of(c3,c4));
        e3.setChocolates(List.of(c5,c6));
        e4.setChocolates(List.of(c7,c8));

        estateRepository.saveAll(List.of(e1,e2,e3,e4));


    }





}
