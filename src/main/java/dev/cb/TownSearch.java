package dev.cb;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class TownSearch {
    private List<String> towns;

    public List<String> search(String criteria) {
        if (criteria.length() < 2) throw new NotFoundException("test");
        return towns;
    }
}