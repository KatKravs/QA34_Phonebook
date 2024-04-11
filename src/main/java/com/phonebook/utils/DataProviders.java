package com.phonebook.utils;

import com.phonebook.models.Contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @org.testng.annotations.DataProvider
    public Iterator<Object[]> addNewContactFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contact.csv")));

        String line = reader.readLine();
        while (line!=null) {

            String[] split = line.split(",");
            list.add(new Object[]{new Contact().setName(split[0]).setLastName(split[1]).setPhone(split[2]).setEmail(split[3]).setAdress(split[4]).setDescription(split[5])});
            line = reader.readLine();
        }

        return list.iterator();
    }

    @org.testng.annotations.DataProvider
    public Iterator<Object[]> addNewContact(){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kate","Kan","1234557890","kan@gmail.com","Munic","goalkeepeer"});
        list.add(new Object[]{"Oliv","Kan","1233457890","kar@gmail.com","Munic","goalkeepeer"});
        list.add(new Object[]{"Mary","Kan","1234545690","kal@gmail.com","Munic","goalkeepeer"});

        return list.iterator();
    }
}
