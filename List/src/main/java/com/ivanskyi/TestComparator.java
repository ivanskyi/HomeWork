package com.ivanskyi;

public class TestComparator implements Comparable<TestComparator> {
    int firstArgument;

    public TestComparator(int firstArgument) {
        this.firstArgument = firstArgument;
    }

    @Override
    public int compareTo(TestComparator value) {
        return value.firstArgument - this.firstArgument;
    }

    @Override
    public String toString() {
        return " TestComparator{ " + " firstArgument= " + firstArgument + '}';
    }
}