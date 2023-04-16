package exercise.controller;

import exercise.model.Person;
import exercise.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PersonRepository personRepository;

    @GetMapping(path = "/{id}")
    public Person getPerson(@PathVariable long id) {
        return this.personRepository.findById(id);
    }

    @GetMapping(path = "")
    public Iterable<Person> getPeople() {
        return this.personRepository.findAll();
    }

    // BEGIN
    @PostMapping(path = "")
    public void createPerson(@RequestBody Person person) {
        this.personRepository.save(person);
    }

    @DeleteMapping(path = "/{id}")
    public void deletePerson(@PathVariable Long id) {
        this.personRepository.deleteById(id);
    }

    @PatchMapping(path = "/{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody Person person) {
        person.setId(id);
        this.personRepository.save(person);
    }
    // END
}
