package com.yang.warrior.com.yang.warrior.hash;

import java.util.Arrays;

/**
 * Created by richardyang on 4/16/17.
 */
public class YangHashtable<K, V> {

    private int hashCode = 0;
    private int size = DEFAULT_CAPACITY;

    private static final int DEFAULT_CAPACITY = 10;

    private Bucket<K, V>[] hashtable = new Bucket[DEFAULT_CAPACITY];

    private void increaseCapacity() {
        int newSize = hashtable.length * 2;
        hashtable = Arrays.copyOf(hashtable, newSize);
        size = newSize;
    }

    /**
     * Use modulus operator with hashtable size to ensure the result hashcode falls within hashtable range.
     * If the hashtable is large, this modulus operator should not be necessary.
     * @param k
     * @return
     */

    private int getHashCode(K k) {
        hashCode = k.hashCode() % size;
        hashCode = hashCode < 0 ? hashCode * -1 : hashCode; // negative occurred when integer overflow so that it back to positive.
  //      System.out.println("After Modulus operation - hasCode :" + hashCode);


        return hashCode;
    }

    public int size() {
        return size;
    }

    public V get( K k) {
        int hashCode = this.getHashCode(k);

        System.out.println("get() Key: " + k + " hashcode: " + hashCode);

        V v = null;

        if (hashtable[hashCode] == null) return null;

        Bucket<K,V> bucket = hashtable[hashCode];

        boolean done = false;
        while (! done) {
            if (bucket.getKey().equals(k)) {
               v = bucket.getValue();
               done = true;
            } else {
                if (null == bucket.next())
                    done = true;
                else
                    bucket = bucket.next();
            }
        }
        return v;
    }

    public void put( K k, V v) {
        int hashCode = this.getHashCode(k);

        System.out.println("put() Key: " + k + " hashcode: " + hashCode);

        if (null == hashtable[hashCode]) { // hashcode lands in empty bucket
            Bucket<K, V> bucket = new Bucket<>();
            bucket.put(k, v);

            hashtable[hashCode] = bucket;
        } else {
            Bucket<K, V> bucket = hashtable[hashCode]; // get the first bucket
            boolean done = false;
            while (! done) {
               if (bucket.getKey().equals(k)) { // existing bucket matches key so update and done
                   done = true;
                   bucket.put(k, v);
               } else if (null == bucket.next()) { // existing bucket key not match and end of bucket list so add and done
                   done = true;
                   Bucket<K, V> nextBucket = new Bucket<>();
                   nextBucket.put(k, v);
                   bucket.put(nextBucket);
               } else { // traverse to next bucket in the link and repeat above logic
                   bucket = bucket.next();
               }

            }

        }
    }


}
