package com.postgresql.testtask.repositories;

import com.postgresql.testtask.entities.ObjEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRepository extends CrudRepository<ObjEntity, Long> {

}
