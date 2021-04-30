package com.company.Managers;


import com.company.Logs.BaseLogger;
import com.company.People.Person;
import com.sun.istack.internal.Nullable;

import java.util.ArrayList;

public abstract class BaseManager {



    // singular methods
   public  void  add(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla eklendi");
       insideLog(logger);
    }

   public void delete(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla silindi");
        insideLog(logger);
    }

   public void update(Person person, @Nullable BaseLogger logger)
    {
        System.out.println(person.toString() + " Başarıyla güncellendi");
        insideLog(logger);
    }

    public  ArrayList<Person> getAll(Person person,@Nullable BaseLogger logger)
    {
        ArrayList<Person> people = null;
        int i=0;
        while(i<40)
        {
            people.add(person);
            i++;
        }
        //........

        System.out.println("Tüm "+person.getDescreption() + " kayıtları başarıyla getirilmiştir.");
        insideLog(logger);

        return people;
    }



    // multiple methods

   public void addMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            add(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla eklendi");
    }

   public void deleteMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            delete(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla silindi");
    }


   public void updateMultiple(Person [] people,@Nullable BaseLogger logger)
    {
        for(Person person:people)
        {
            update(person,logger);
        }

        System.out.println("Toplu iş dosyası başarıyla güncellendi");
    }











    private void insideLog(BaseLogger logger)
    {
        if(logger!=null)
        {
            logger.log();
        }
    }

}
