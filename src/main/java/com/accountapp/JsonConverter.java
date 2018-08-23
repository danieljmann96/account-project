package com.accountapp;

import com.google.gson.*;

import java.util.Map;

public class JsonConverter {
    public static String fromMap(Map<Integer, Account> input){
        Gson gson = new Gson();
        return gson.toJson(input);
    }
}
