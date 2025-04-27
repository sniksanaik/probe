package com.naimish.sea.util;

import com.naimish.sea.constants.Commands;
import com.naimish.sea.exception.OutOfTheGridException;
import com.naimish.sea.modal.Probe;
import com.naimish.sea.to.Grid;

public class Util {

    public static void validate(String direction, Probe probe) {
        Commands c = Commands.valueOf(direction);

        switch (c) {
            case Commands.FORWARD:
                int forwardY = probe.getY();

                if (!(forwardY <= Grid.FORWARD_MAX.getY() && forwardY >= Grid.FORWARD_MIN.getY())) {
                    throw new OutOfTheGridException();
                }

                break;
            case Commands.BACKWARD:
                int backwardY = probe.getY();
                if (!(backwardY <= Grid.BACKWARD_MAX.getY() && backwardY >= Grid.BACKWARD_MIN.getY())) {
                    throw new OutOfTheGridException();
                }
                break;
            case Commands.LEFT:

                int left = probe.getX();
                if (!(left <= Grid.LEFT_MAX.getY() && left >= Grid.LEFT_MIN.getY())) {
                    throw new OutOfTheGridException();
                }

                break;
            case Commands.RIGHT:
                int right = probe.getX();
                if (!(right <= Grid.RIGHT_MAX.getY() && right >= Grid.RIGHT_MIN.getY())) {
                    throw new OutOfTheGridException();
                }
                break;
        }


    }

}
