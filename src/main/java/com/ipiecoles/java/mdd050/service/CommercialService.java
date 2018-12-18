package com.ipiecoles.java.mdd050.service;

import com.ipiecoles.java.mdd050.repository.CommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommercialService {

    @Autowired
    CommercialRepository commercialRepository;
}