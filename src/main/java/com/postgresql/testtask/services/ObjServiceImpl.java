package com.postgresql.testtask.services;

import com.postgresql.testtask.entities.JsonObject;
import com.postgresql.testtask.entities.ObjEntity;
import com.postgresql.testtask.repositories.ObjectRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ObjServiceImpl implements ObjService {

    @Autowired
    private ObjectRepository objDao;

    @Override
    public List<ObjEntity> clientsList() {
        return (List<ObjEntity>) objDao.findAll();
    }

    @Override
    public ObjEntity findById(Long id) {
        Optional<ObjEntity> obj = objDao.findById(id);
        if (!obj.isPresent()) {
            throw new NotFoundException();
        }
        return obj.get();
    }

    @Override
    public ObjEntity createObj(int value) {
        ObjEntity obj = new ObjEntity();
        JsonObject jsonObject = new JsonObject();
        jsonObject.setValue(value);
        obj.setJsonObject(jsonObject);
        return null;
    }

    @Override
    @Transactional
    public JsonObject updateObj(Long id, int add) {
        Optional<ObjEntity> obj = objDao.findById(id);
        if (!obj.isPresent()) {
            throw new NotFoundException();
        }
        JsonObject jsonObject = obj.get().getJsonObject();
        jsonObject.setValue(jsonObject.getValue() + add);
        obj.get().setJsonObject(jsonObject);
        objDao.save(obj.get());
        return jsonObject;
    }

    @Override
    public void deleteById(Long id) {
        Optional<ObjEntity> obj = objDao.findById(id);
        if (!obj.isPresent()) {
            throw new NotFoundException();
        }
        objDao.deleteById(id);
    }
}
