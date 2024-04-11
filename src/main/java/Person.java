import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Comparator;
import java.util.Objects;


public class Person implements Comparable<Person> {



    public String nom;

    public int salary;

    public int age;






    public Person(String nom, int salary, int age) {
        this.nom = nom;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {

        Person person = (Person) o;
        return salary == person.salary ;
    }


}



class PersonSalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPlayer, Person secondPlayer) {
        if (firstPlayer.salary > secondPlayer.salary) {
            return 1;
        } else if (firstPlayer.salary == secondPlayer.salary) {
            return 0;
        } else {
            return -1;
        }
    }

}

class PersonAgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person firstPlayer, Person secondPlayer) {
        if (firstPlayer.age > secondPlayer.age) {
            return 1;
        } else if (firstPlayer.age == secondPlayer.age) {
            return 0;
        } else {
            return -1;
        }
    }

}

