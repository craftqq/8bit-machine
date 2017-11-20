package com.streamGenerator;

import com.ILogicPart;

public interface IStreamGeneratorLogicPart extends ILogicPart
{   
    /**
     * stream generators normally only provide a stream of bytes read from the out stream.
     */
    @Override
    public default void writeToInStream(ILogicPart source, byte[] in)
    {
        //NOOP
        return;
    }
}
