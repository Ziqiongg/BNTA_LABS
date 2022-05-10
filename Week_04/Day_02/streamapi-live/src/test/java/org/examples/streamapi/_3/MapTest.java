package org.examples.streamapi._3;


import org.examples.streamapi.model.Person;
import org.examples.streamapi.model.PersonDTO;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.examples.streamapi.TestUtil.PEOPLE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapTest {

    @Test
    void mapPersonObjectsToStrings_comments() {
        List<String> names = PEOPLE
                .stream()
                .map(
                        (person) -> {
                            return person.getName();
                        }
                )
                .toList();
        // Certainly not the best way to check the returned list, but it will do for this case ;)
        assertEquals("Alec", names.get(0));
        assertEquals("Alivia", names.get(19));
        assertEquals(20, names.size());
    }

    @Test
    void mapPersonObjectsToStrings() {

        List<String> names = PEOPLE
                .stream()
                /*
                    The syntax can get even crazier - but this is just a syntax sugar!
                    It's the same as in the first example, so use the extended (the most obvious version)
                    and then use IntelliJ to get to the most straightforward ( at the beginning, the craziest) syntax.
                 */
                .map(Person::getName)
                .toList();

        assertEquals("Alec", names.get(0));
        assertEquals("Alivia", names.get(19));
        assertEquals(20, names.size());
    }


    @Test
    void mapPersonObjectsAge(){
        List<Integer> ages = PEOPLE.stream().map(Person::getAge).toList();
        assertEquals(20,ages.size());
    }

    @Test
    void mapPersonObjectsLastName(){
        List<String> lastName = PEOPLE.stream().map(Person::getLastName).toList();
        assertEquals(20,lastName.size());
    }
    @Test
    void mapPersonObjectsGender(){
        List<Person.Gender> gender = PEOPLE.stream().map(Person::getGender).toList();
        assertEquals(20,gender.size());
    }



    @Test
    void mapPersonObjectsPersonDTO(){

        List<PersonDTO> personcollection = PEOPLE
                .stream()
                .map(

                        (person) -> {
                            return new PersonDTO(person.getName(), person.getLastName());
                        }
                )
                .toList();
//                        (person) -> {
//                    String name = person.getName();
//                    String lastName = person.getLastName();
//                    return new PersonDTO(name, lastName);
        assertEquals(20,personcollection.size());
    }



    }
/*
    Time for some practice:
     - map to List<Integers> (age)
     - map to List<String> (lastName)
     - map to List<Person.GENDER>

     extras: map List<Person> to List<PersonDTO>
 */
}





