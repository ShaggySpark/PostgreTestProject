package com.postgresql.testtask.services;

import com.postgresql.testtask.entities.JsonObject;
import com.postgresql.testtask.entities.ObjEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ObjService {
    List<ObjEntity> clientsList ();
    ObjEntity findById(Long id);
    ObjEntity createObj(int value);
    JsonObject updateObj(Long id, int add);
    void deleteById(Long id);
}
