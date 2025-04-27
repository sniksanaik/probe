package com.naimish.sea.repo;


import com.naimish.sea.modal.Probe;
import com.naimish.sea.to.ProbeTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProbeRepo extends CrudRepository<Probe,Integer> {

    Probe findTopByOrderByCreateTimeDesc();

}
