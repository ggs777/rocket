package com.workspace.rocket.pen.abstracts;

import com.workspace.rocket.pen.interfaces.WritingStrategy;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pen {

    private final String name;
    private final String brand;
    private final Double price;
    private final WritingStrategy writingStrategy;

    public void write(){
        writingStrategy.write();
    }
}
