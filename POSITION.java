package com.company;

public enum POSITION {
    JUNIOR(500),
    MIDDLE(2000),
    SENIOR(5000),
    SENIOR_POMIDOR(10000);

    public final int minSalary;

     POSITION (int minSalary){
         this.minSalary = minSalary;
     }
}
