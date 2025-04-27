package com.naimish.sea.to;

public interface Grid {
   LocationTO FORWARD_MIN=new LocationTO(0,0);
   LocationTO FORWARD_MAX=new LocationTO(0,100);
   LocationTO BACKWARD_MIN=new LocationTO(0,100);
   LocationTO BACKWARD_MAX=new LocationTO(0,0);

    LocationTO LEFT_MIN=new LocationTO(100,0);
   LocationTO LEFT_MAX=new LocationTO(0,100);
   LocationTO RIGHT_MIN=new LocationTO(0,100);
   LocationTO RIGHT_MAX=new LocationTO(100,0);



}
