package com.accountapp;

import com.google.gson.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public final class JsonConverter {
    private JsonConverter(){}
    public static String fromMap(Map<Integer, Account> input){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(input);
    }
    public static void toFile(String input) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Admin\\ExternalApps\\Account Application\\src\\main\\resources\\students.json"));
        writer.write(input);
        writer.close();
    }
}
