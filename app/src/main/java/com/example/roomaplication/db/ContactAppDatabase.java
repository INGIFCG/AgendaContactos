package com.example.roomaplication.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.roomaplication.db.ContactDAO;
import com.example.roomaplication.db.entity.Contact;

//contain all the table of the database

@Database(entities = {Contact.class},version = 1)
public abstract class ContactAppDatabase extends RoomDatabase {

    //Linkg the DAO WHIT THE OTER DATABASE

    public abstract ContactDAO getContactDao();



}
