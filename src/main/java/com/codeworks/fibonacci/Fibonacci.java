package com.codeworks.fibonacci;

public class Fibonacci {

    private long minusTwoRankValue = 0;
    private long minusOneRankValue = 1;
    private long desiredRankValue = 0;

    public long calculate(int rank) {
        if(rank == 0) {
            return minusTwoRankValue;
        }
        if(rank == 1) {
            return minusOneRankValue;
        }
        desiredRankValue = minusOneRankValue + minusTwoRankValue;
        minusTwoRankValue = minusOneRankValue;
        minusOneRankValue = desiredRankValue;
        return calculate(rank - 1);
    }
}
