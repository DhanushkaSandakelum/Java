package org.async.parallelstreams;

import org.async.util.DataSet;

import java.util.List;
import java.util.stream.Collectors;

import static org.async.util.CommonUtil.*;
import static org.async.util.LoggerUtil.log;

public class ParallelStreams {
    public static void main(String[] args) {
        List<String> namesList = DataSet.namesList();

        ParallelStreams parallelStreams = new ParallelStreams();

        startTimer();
        List<String> resultList1 = parallelStreams.stringTransformViaStreams(namesList);

        log("resultsList(Streams): " + resultList1);
        timeTaken();

        resetTimer();

        startTimer();
        List<String> resultList2 = parallelStreams.stringTransformViaParallelStreams(namesList);

        log("resultsList(ParallelStreams): " + resultList2);
        timeTaken();
    }

    // Streams
    public List<String> stringTransformViaStreams(List<String> namesList) {
        return namesList
                .stream()
                .map(this::addNameLengthTransform)
                .collect(Collectors.toList());
    }

    // Parallel Streams
    public List<String> stringTransformViaParallelStreams(List<String> namesList) {
        return namesList
                .parallelStream()
                .map(this::addNameLengthTransform)
                .collect(Collectors.toList());
    }

    private String addNameLengthTransform(String name) {
        delay(500);

        return name.length() + " - " + name;
    }
}
