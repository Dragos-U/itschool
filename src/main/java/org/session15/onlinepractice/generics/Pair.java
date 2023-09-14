package org.session15.onlinepractice.generics;

public class Pair<K,V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("age", 30);
        System.out.println(pair.getKey() + " "+ pair.getValue());
    }
}
