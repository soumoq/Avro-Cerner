package com.pojo;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.commons.lang.RandomStringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Generation {


    public static void main(String[] args) throws IOException {
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

        serialize(persion);
        deSerialize();
    }

    private static void serialize(Persion persion) throws IOException {
        File file = new File("user.avro");
        DatumWriter<Persion> userDatum = new SpecificDatumWriter<>(Persion.class);
        DataFileWriter<Persion> dataFileWriter = new DataFileWriter<>(userDatum);
        dataFileWriter.create(persion.getSchema(), file);
        dataFileWriter.append(persion);
        dataFileWriter.close();
    }

    private static Persion deSerialize() throws IOException {
        File file = new File("Output.txt");
        File avroFile = new File("user.avro");

        if (file.exists()) {
            file.delete();
        }

        PrintWriter printWriter = new PrintWriter(new FileWriter("Output.txt", true), true);
        DatumReader<Persion> datumReader = new SpecificDatumReader<>(Persion.class);

        DataFileReader<Persion> dataFileReader = new DataFileReader<Persion>(avroFile,datumReader);
        Persion user = null;
        while (dataFileReader.hasNext()){
            user = dataFileReader.next(user);
            System.out.println(user);
        }
        printWriter.close();
        return user;
    }

}
