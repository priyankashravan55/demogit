package com.cjc.app.mfi.master.main.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.mfi.master.main.model.GuarantorDetails;
@Repository
public interface GranterREpository extends CrudRepository<GuarantorDetails , Integer>{

}
