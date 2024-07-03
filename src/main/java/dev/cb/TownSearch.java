package dev.cb;

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
            throw new NotFoundException("Criteria must be at least 2 characters");
        } else {
            return towns.stream().filter((t) -> t.toLowerCase().contains(criteria.toLowerCase())).toList();
        }
    }
}
