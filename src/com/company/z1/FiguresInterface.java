package com.company.z1;

import java.util.List;
import java.util.Optional;

public interface FiguresInterface {
    private List<Integer> getIntegerList(){
        return List.of( -3, -5, 0, 1, -6, 2);
    }

    default void printFirstPositive(){
       Optional<Integer> result = getIntegerList().stream().filter(integer -> integer > 0).findFirst();
       System.out.println(result.orElseThrow());
    }
}
