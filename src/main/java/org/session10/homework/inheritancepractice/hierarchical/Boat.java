package org.session10.homework.inheritancepractice.hierarchical;

public abstract class Boat {

    private int length;
    private int weight;

    public void sail() {
        System.out.println("This boat is sailing");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}