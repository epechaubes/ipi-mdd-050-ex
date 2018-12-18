package com.ipiecoles.java.mdd050.controller;
import com.ipiecoles.java.mdd050.model.Employe;
import com.ipiecoles.java.mdd050.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/employes")
public class EmployeController {

    @Autowired
    EmployeService employeService;

    @RequestMapping()
    public Page<Employe> listeEmployes (
            @RequestParam (value = "page") Integer page,
            @RequestParam (value = "size") Integer size,
            @RequestParam (value = "sortDirection") String sortDirection,
            @RequestParam (value = "sortProperty") String sortProperty
    ) throws Exception {
        return employeService.findAllEmployesPaging(page, size, sortProperty, sortDirection);
    }

    @RequestMapping("/count")
    public Long nombreEmployes () throws Exception {
        return employeService.nombreEmployes();
    }

    @RequestMapping(value = "/{id}")
    public Employe infosEmploye (
            @PathVariable (value = "id") Long id
    ) throws Exception {
        if (employeService.infosEmploye(id) != null){
            return employeService.infosEmploye(id);
        }
        else {
            throw new EntityNotFoundException("L'employé d'identifiant : " + id + " n'a pas été trouvé.");
        }
    }

    @RequestMapping(params = "matricule")
    public Employe searchBar (
           @RequestParam (value = "matricule") String matricule
    ) throws Exception {
        return employeService.searchBar(matricule);
    }
}
