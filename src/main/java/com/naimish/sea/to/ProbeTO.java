package com.naimish.sea.to;

import com.naimish.sea.constants.Commands;

public class ProbeTO {

    private String direction= Commands.FORWARD.name();
    private LocationTO locationTO =new LocationTO(0,0);




    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public LocationTO getLocation() {
        return locationTO;
    }

    public void setLocation(LocationTO locationTO) {
        this.locationTO = locationTO;
    }
}
