package com.ipiecoles.java.mdd050.controller;
import com.ipiecoles.java.mdd050.service.CommercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommercialController {

    @Autowired
    CommercialService commercialService;
}