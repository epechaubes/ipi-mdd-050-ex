package com.ipiecoles.java.mdd050.service;

import com.ipiecoles.java.mdd050.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    ManagerRepository managerRepository;
}
