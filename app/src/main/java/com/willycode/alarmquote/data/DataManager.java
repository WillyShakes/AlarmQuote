package com.willycode.alarmquote.data;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.willycode.alarmquote.data.model.Quote;

import java.util.List;

//TODO  Singleton
public class DataManager {


    public DataManager() {

    }



    public List<Quote> getQuotes() {
        Firebase myFirebaseRef = new Firebase("https://alarmquote.firebaseio.com/");
        myFirebaseRef.child("quotes").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue());  //prints "Do you have data? You'll love Firebase."
            }
            @Override public void onCancelled(FirebaseError error) {

            }
        });
        return null;
    }




}
