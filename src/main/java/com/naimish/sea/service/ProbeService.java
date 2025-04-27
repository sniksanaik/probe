package com.naimish.sea.service;


import com.naimish.sea.modal.Probe;
import com.naimish.sea.repo.ProbeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProbeService {

    @Autowired
    ProbeRepo probeRepo;


    public Probe getCurrentProbe() {

        return probeRepo.find
    }

    public Iterable<Probe> getTravelDetails() {
        return probeRepo.findAll();

    }

}
