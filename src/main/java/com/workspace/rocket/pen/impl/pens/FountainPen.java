package com.workspace.rocket.pen.impl.pens;

import com.workspace.rocket.pen.abstracts.Pen;
import com.workspace.rocket.pen.interfaces.WritingStrategy;
import com.workspace.rocket.pen.models.Ink;
import com.workspace.rocket.pen.models.Nib;
import lombok.Data;

public class FountainPen extends Pen {

    private final Ink ink;
    private final Nib nib;

    public FountainPen(String name, String brand, Double price, WritingStrategy writingStrategy,
                       Ink ink, Nib nib) {
        super(name, brand, price, writingStrategy);
        this.nib = nib;
        this.ink = ink;
    }
}
