package com.postgresql.testtask.controllers;

import com.postgresql.testtask.entities.JsonObject;
import com.postgresql.testtask.services.ObjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class ObjApi {

    @Autowired
    ObjService objService;

    @PostMapping("/modify")
    public ResponseEntity<?> createParkingSpot(@PathVariable Long id, @PathVariable int add) {
        JsonObject jsonObject = objService.updateObj(id, add);
        return new ResponseEntity<>(jsonObject, HttpStatus.OK);
    }
}
