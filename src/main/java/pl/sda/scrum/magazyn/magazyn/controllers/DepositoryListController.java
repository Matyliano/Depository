package pl.sda.scrum.magazyn.magazyn.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.scrum.magazyn.magazyn.model.DepositoryList;
import pl.sda.scrum.magazyn.magazyn.model.DepositoryModel;
import pl.sda.scrum.magazyn.magazyn.repository.DepositoryListRepository;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin()
public class DepositoryListController {

    @Autowired
    DepositoryListRepository depositoryListRepository;

}
