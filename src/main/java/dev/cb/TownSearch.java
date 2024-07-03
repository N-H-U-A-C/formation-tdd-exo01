package dev.cb;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TownSearch {
    private List<String> towns;

    public TownSearch() {
        towns = Arrays.asList("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
    }

    public List<String> search(String criteria) {
        if (criteria.equals("*")) {
            return towns;
        } else if (criteria.length() < 2) {
            throw new NotFoundException("test");
        } else {
            return towns.stream().filter((t) -> t.toLowerCase().contains(criteria.toLowerCase())).toList();
        }
    }
}