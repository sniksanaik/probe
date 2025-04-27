package com.naimish.sea.controller;


import com.naimish.sea.constants.Commands;
import com.naimish.sea.modal.Probe;
import com.naimish.sea.service.ProbeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static com.naimish.sea.constants.Commands.FORWARD;

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
//validate with the grid

            case Commands.BACKWARD:
                //decrement y
//validate with the grid
            case Commands.LEFT:
                //decrement x
//validate with the grid
            case Commands.RIGHT:
                //increment x
//validate with the grid

        }


    }

    @GetMapping(path = "probe/travels")
    public void getTravelDetails(@PathVariable String direction) {


    }


}
