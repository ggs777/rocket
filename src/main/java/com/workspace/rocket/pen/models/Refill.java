package com.workspace.rocket.pen.models;

import lombok.Data;

@Data
public class Refill {

    private final Boolean refillable;
    private final Ink ink;
    private final Nib nib;

}
