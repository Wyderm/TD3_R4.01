package org.example.td3_r401.controller;

import org.example.td3_r401.model.annuaireItrf;
import org.example.td3_r401.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class AnnuaireController {

    @Autowired
    private annuaireItrf annuaireService;

    @GetMapping("/annuaire")
    public String getPersons(@RequestParam(value = "name", required = false) String name, Model model) {
        List<Person> persons;
        if (name != null && !name.isEmpty()) {
            persons = annuaireService.getAllPersons().stream()
                    .filter(p -> p.getNom().equalsIgnoreCase(name))
                    .collect(Collectors.toList());
        } else {
            persons = annuaireService.getAllPersons();
        }
        model.addAttribute("persons", persons);
        return "annuaire";
    }

    @GetMapping("/addPerson")
    public String showAddPersonForm(Model model) {
        model.addAttribute("person", new Person());
        return "addPerson";
    }

    @PostMapping("/addPerson")
    public String addPerson(@ModelAttribute Person person) {
        annuaireService.addPerson(person);
        return "redirect:/annuaire";
    }

    @GetMapping("/supprimer")
    public String deletePersonByIdRequestParam(@RequestParam("id") int id) {
        annuaireService.deletePersonById(id);
        return "redirect:/annuaire";
    }

    @GetMapping("/supprimer/{id}")
    public String deletePersonByIdPathVariable(@PathVariable("id") int id) {
            annuaireService.deletePersonById(id);
        return "redirect:/annuaire";
    }
}