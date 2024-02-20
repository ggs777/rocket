package com.workspace.rocket.pen.impl.pens;

import com.workspace.rocket.pen.abstracts.Pen;
import com.workspace.rocket.pen.interfaces.PenWithRefill;
import com.workspace.rocket.pen.interfaces.WritingStrategy;
import com.workspace.rocket.pen.models.Refill;
import lombok.AllArgsConstructor;

public class GelPen extends Pen implements PenWithRefill {

    private Refill refill;

    public GelPen(String name, String brand, Double price, WritingStrategy writingStrategy,
                  Refill refill) {
        super(name, brand, price, writingStrategy);
        this.refill = refill;
    }


    @Override
    public Boolean isRefillable() {
        return refill.getRefillable();
    }

    @Override
    public void changeRefill(Refill refill) {
        if(refill.getRefillable()){
            this.refill = refill;
        }
    }
}
