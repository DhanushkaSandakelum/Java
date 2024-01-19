package org.async.parallelstreams;

import org.async.util.DataSet;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.async.util.CommonUtil.startTimer;
import static org.async.util.CommonUtil.timeTaken;
import static org.junit.jupiter.api.Assertions.*;

class ParallelStreamsTest {
    ParallelStreams parallelStreams = new ParallelStreams();

    @Test
    void stringTransform() {
        // given
        List<String> inputList = DataSet.namesList();

        // when
        startTimer();
        List<String> outputList = parallelStreams.stringTransformViaParallelStreams(inputList);
        timeTaken();

        // then
        assertEquals(4, outputList.size());
        outputList.forEach(name -> {
            assertTrue(name.contains("-"));
        });
    }
}