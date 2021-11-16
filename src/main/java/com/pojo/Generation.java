package com.pojo;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Generation {


    public static void main(String[] args) {
        List<CharSequence> address = new ArrayList<>();
        address.add("Address    1");

        Name name = new Name();
        name.setFirstName("Fname");
        name.setLastName("Lname");
        name.setFullName("Fname Lname");

        List<Phrchases> phrchases = new ArrayList<>();
        Phrchases phrchases1 = new Phrchases();
        phrchases1.setAmount(100.00);
        phrchases1.setGeneric("A");
        phrchases1.setPurchaseBy("ABCD");
        phrchases1.setPurchaseData("ABCD");
        phrchases1.setStoreId(12);
        phrchases.add(phrchases1);


        Persion persion = new Persion();
        persion.setAddresses(address);
        persion.setGender("M");
        persion.setPersionId(1);
        persion.setEmail("abc@gmail.com");
        persion.setName(name);
        persion.setPurchases(phrchases);

    }
}
