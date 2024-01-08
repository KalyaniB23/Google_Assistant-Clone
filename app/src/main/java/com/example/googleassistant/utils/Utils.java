package com.example.googleassistant.utils;

import android.annotation.SuppressLint;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.googleassistant.R;

public class Utils {

    public static final String[] Command = {"check my mail\",\"what can i do\",\"can we date\",\"how to use google assistant\",\"hey \", \"for example : search assistant\",\"explore\",\"how to use google assistant\",\"hi\",\"hello\",\"thanks\",\"welcome\",\"clear\",\"date\",\"time\",\"dial\",\"send SMS\", \"send sms\", \"joke\", \"tell me a joke\"\n" +
            "        ,\"ask me fun questions\", \"open Whatsapp\" , \"open Facebook\" , \"open Gmail\", \"open Youtube\" , \"open  GoogleMaps\" , \"open Google\",\n" +
            "        \"turn on Bluetooth\" , \"For example : call mum or call papa \",  \"dial\" , \"turn off Bluetooth\" , \"turn on Flash\" , \"turn off Flash\",\"capture photo\" , \"any thoughts\",\n" +
            "                \"play ringtone\",\"stop ringtone\",\"are you married\",\"haha\",\"read me\",\"read my last sms\",\"share file\",\"share a text message that your message\",\n" +
            "        \"get bluetooth devices\",\"copy to clipboard\",\"read last clipboard\",\"open google lens\",\"explore\",\"what is your name\" , \"play some music\",\n" +
            "        \"stop music\""};

    public static final String logTTS = "Text to Speech";
    public static final String logSR = "SR";

    public static final String logKeeper = "Keeper";
    public static final String tableName = "assistant_message_table";

    public static void setCustomActionBar(ActionBar supportActionBar, Context context) {
        if (supportActionBar != null) {
            Log.d("Utils", "ActionBar is here");
            supportActionBar.setDisplayShowHomeEnabled(true);
            supportActionBar.setDisplayShowTitleEnabled(false);
            LayoutInflater mInflater = LayoutInflater.from(context);
            @SuppressLint("InflateParams") View mCustomView = mInflater.inflate(R.layout.custom_toolbar, null);
            supportActionBar.setCustomView(mCustomView);
            supportActionBar.setDisplayShowCustomEnabled(true);
        } else {
            Log.e("Utils", "ActionBar is null");
        }
    }

    public static void setCustomActionBarFragment(Fragment fragment, Context context) {
        setCustomActionBar( ((AppCompatActivity) fragment.requireActivity()).getSupportActionBar(), context);
    }
}

