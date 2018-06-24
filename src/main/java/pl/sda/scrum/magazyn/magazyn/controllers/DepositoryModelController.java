package pl.sda.scrum.magazyn.magazyn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.sda.scrum.magazyn.magazyn.model.DepositoryModel;
import pl.sda.scrum.magazyn.magazyn.repository.DepositoryRepository;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin()
public class DepositoryModelController {

    @Autowired
    DepositoryRepository depositoryRepository;

    @RequestMapping(path = "/dostawa", method = RequestMethod.GET)
    public List<DepositoryModel> test() {
        return depositoryRepository.findAll();
    }

    @PostMapping(path = "/dostawa")
    @ResponseStatus(HttpStatus.CREATED)
    public DepositoryModel create(@RequestBody DepositoryModel depositoryModel) {
        return depositoryRepository.save(depositoryModel);
    }

}
