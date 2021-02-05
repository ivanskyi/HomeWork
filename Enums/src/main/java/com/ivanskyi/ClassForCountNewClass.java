package com.ivanskyi;

public class ClassForCountNewClass {
    static public int count = 0;

    {
        count += 1;
    }

    public ClassForCountNewClass() {
    }
}