package com.yang.warrior.com.yang.warrior.hash;

/**
 * Created by richardyang on 4/16/17.
 */
public class Bucket<K, V> {

    private K k;
    private V v;
    private Bucket<K, V> nextBucket = null;

    public void put(K k, V v) {
        this.k = k;
        this.v = v;
    }


    public K getKey() {
        return k;
    }

    public V getValue() {
        return v;
    }


    public Bucket<K, V> next() {
        return this.nextBucket == null ? null : this.nextBucket;

    }

    public void put (Bucket<K, V> newBucket) {
        this.nextBucket = newBucket;
    }

}
