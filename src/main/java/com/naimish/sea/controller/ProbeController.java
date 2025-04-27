package com.naimish.sea.controller;


import com.naimish.sea.constants.Commands;
import com.naimish.sea.modal.Probe;
import com.naimish.sea.service.ProbeService;
import com.naimish.sea.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class ProbeController {

    @Autowired
    ProbeService probeService;

    @GetMapping(path = "command/direction/{direction}")
    public void command(@PathVariable String direction) {
        //get The current location
        Probe p = probeService.getCurrentProbe();

        Commands c = Commands.valueOf(direction);

        switch (c) {
            case Commands.FORWARD:

                //increment y

                int incY = p.getY() + 1;
                Probe fProbe = new Probe(direction, p.getX(), incY);
                //validate with the grid
                Util.validate(direction, fProbe);
                probeService.save(fProbe);

                break;
            case Commands.BACKWARD:
                //decrement y
                int decY = p.getY() + 1;
                Probe bProbe = new Probe(direction, p.getX(), decY);
                //validate with the grid
                Util.validate(direction, bProbe);
                probeService.save(bProbe);

                break;
            case Commands.LEFT:
                //decrement x

                int decX = p.getX() - 1;
                Probe lProbe = new Probe(direction, decX, p.getY());
                //validate with the grid
                Util.validate(direction, lProbe);

                probeService.save(lProbe);


                break;
            case Commands.RIGHT:
                //increment x
                int incX = p.getX() + 1;
                Probe rProbe = new Probe(direction, incX, p.getY());
                //validate with the grid
                Util.validate(direction, rProbe);
                probeService.save(rProbe);

                break;
        }


    }

    @GetMapping(path = "probe/travels")
    public Iterable<Probe> getTravelDetails(@PathVariable String direction) {

        return probeService.getTravelDetails();
    }


}
