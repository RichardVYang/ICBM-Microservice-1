package com.yang.warrior.com.yang.warrior.hash;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by richardyang on 4/16/17.
 */
class YangHashtableTest {

  //  YangHashtable<String, String> myHashTable = new YangHashtable<>();

    @BeforeEach
    void setUp() {
        /*
        System.out.println("Entering setUP()....");
     //   myHashTable.setHashCode(1);
        myHashTable.put("Asgard", "Richard Richard");
     //   myHashTable.setHashCode(2);
        myHashTable.put("Constellation", "Vang Yang");
     //   myHashTable.setHashCode(3);
        myHashTable.put( "GalaxyX", "Thai Yang");
        */
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getString() {
        System.out.println("Entering getSring()....");
        YangHashtable<String, String> myHashTable = new YangHashtable<>();
        //   myHashTable.setHashCode(1);
        myHashTable.put("Asgard", "Richard Richard");
        //   myHashTable.setHashCode(2);
        myHashTable.put("Constellation", "Vang Yang");
        //   myHashTable.setHashCode(3);
        myHashTable.put( "GalaxyX", "Thai Yang");

        System.out.println("Entering get()...");
     //   myHashTable.setHashCode(2);
        System.out.println("key: Constellation : " + myHashTable.get( "Constellation"));
    }

    @Test
    void getNumberString() {
        System.out.println("Entering getNumberString()....");
        YangHashtable<Integer, String> myHashTable = new YangHashtable<>();
        myHashTable.put(12345, "Vaaj Yang");
        myHashTable.put(2468, "Rwm Muas");

    }

    @Test
    void put() {
        System.out.println("entering put()...");
        YangHashtable<String, String> myHashTable = new YangHashtable<>();
      //  myHashTable.setHashCode(4);
        myHashTable.put("Goddess", "True Moua");
    }

}