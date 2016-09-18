package com.codecar.controller;

import com.codecar.entity.Car;
import com.codecar.service.QualifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/rest/")
public class QualifyController {
    private QualifyService qualifyService;

    @Autowired
    public QualifyController(QualifyService qualifyService) {
        this.qualifyService = qualifyService;
    }

    @RequestMapping(value = "qualify")
    public Map<Integer, Car> qualify() {
        return qualifyService.qualify();
    }
}
