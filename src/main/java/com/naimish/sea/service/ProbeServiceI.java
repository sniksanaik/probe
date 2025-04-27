package com.naimish.sea.service;

import com.naimish.sea.modal.Probe;
import com.naimish.sea.repo.ProbeRepo;

public interface ProbeServiceI {



    public Iterable<Probe> getTravelDetails() ;

    public Probe getCurrentProbe();

    public Probe save(Probe probe) ;

}
