package com.workspace.rocket.pen.impl.writingstrategies;

import com.workspace.rocket.pen.interfaces.WritingStrategy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RoughWriting implements WritingStrategy {

    @Override
    public void write(){
        log.info("Writing roughly !");
    }
}
