package com.ipiecoles.java.mdd050.service;

import com.ipiecoles.java.mdd050.repository.TechnicienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicienService {

    @Autowired
    TechnicienRepository technicienRepository;
}