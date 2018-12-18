package com.ipiecoles.java.mdd050.service;

import com.ipiecoles.java.mdd050.model.Employe;
import com.ipiecoles.java.mdd050.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {

    @Autowired
    EmployeRepository employeRepository;

    public Page<Employe> findAllEmployesPaging(Integer page, Integer size, String sortDirection, String sortProperty){
        PageRequest pageRequest = new PageRequest(page, size, sortDirection, sortProperty);
        return employeRepository.findAll(pageRequest);
    }

    public Long nombreEmployes () { return employeRepository.count(); }

    public Employe infosEmploye (Long id) {
        return employeRepository.findOne(id);
    }

    public Employe searchBar (String matricule) {return employeRepository.findByMatricule(matricule);}
}
