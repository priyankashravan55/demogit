package com.cjc.app.mfi.master.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.DocumentsDetails;

@Repository
public interface HomeRepository extends CrudRepository<DocumentsDetails, Integer> {

}
