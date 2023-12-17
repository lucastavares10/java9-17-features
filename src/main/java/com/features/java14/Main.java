package com.features.java14;

import com.features.java14.instanceOf.AbstractFile;
import com.features.java14.instanceOf.MusicFile;
import com.features.java14.records.Person;
import com.features.java14.records.PersonRecord;

public class Main {

    public static void main(String[] args) {

        //old way using methods throught abstract classes
        AbstractFile abstractFile = new MusicFile();

        if (abstractFile instanceof MusicFile) {
            ((MusicFile) abstractFile).playMusic(); //needs cast
        }

        // new way

        if (abstractFile instanceof MusicFile musicFile) { //new variable
            musicFile.playMusic();
        }


        //Records

        Person person1 = new Person("Lucas", 27);
        PersonRecord person2 = new PersonRecord("Alfred", 60);

        System.out.println("person1 -> " + person1.toString());
        System.out.println("person2 -> " + person2.toString());


        //improvements in null pointer exception logs


    }
}
