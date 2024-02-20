package com.workspace.rocket.pen;

import com.workspace.rocket.pen.impl.pens.FountainPen;
import com.workspace.rocket.pen.impl.pens.GelPen;
import com.workspace.rocket.pen.impl.writingstrategies.RoughWriting;
import com.workspace.rocket.pen.impl.writingstrategies.SmoothWriting;
import com.workspace.rocket.pen.models.Ink;
import com.workspace.rocket.pen.models.Nib;
import com.workspace.rocket.pen.models.Refill;

public class PenRunner {
    public static void main(String[] args) {

        Ink blackFluidInk = new Ink("Black", 10.0);
        Nib nib = new Nib(10.0, 20.0);

        SmoothWriting smoothWriting = new SmoothWriting();
        RoughWriting roughWriting = new RoughWriting();
        Refill refillableRefill = new Refill(true, blackFluidInk, nib);

        GelPen gelPen = new GelPen("Awesome", "The Best", 120.02, smoothWriting, refillableRefill);
        gelPen.write();

        FountainPen fountainPen = new FountainPen("Old", "Gold", 100.30, roughWriting, blackFluidInk, nib);
        fountainPen.write();
    }
}
