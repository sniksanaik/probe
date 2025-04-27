package com.naimish.sea.service;


import com.naimish.sea.modal.Probe;
import com.naimish.sea.repo.ProbeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProbeService implements ProbeServiceI {

    @Autowired
    ProbeRepo probeRepo;

    public Iterable<Probe> getTravelDetails() {
        return probeRepo.findAll();

    }

    public Probe getCurrentProbe() {
       return probeRepo. findTopByOrderByCreateTimeDesc();
    }

    public Probe save(Probe probe) {
       return probeRepo.save(probe);
    }


}
