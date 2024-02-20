package com.workspace.rocket.pen.interfaces;

import com.workspace.rocket.pen.models.Refill;

public interface PenWithRefill {

    Boolean isRefillable();

    void changeRefill(Refill refill);
}
