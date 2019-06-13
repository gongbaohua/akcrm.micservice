package com.avatech.edi.akcrm.tools;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.List;

public class Tools {
    public static <T> String serialization(T t) throws IOException{
        String Json = "";
        ObjectMapper objectMapper = new ObjectMapper();
        Json = objectMapper.writeValueAsString(t);
        return Json;
    }
    public static String readJsonFile(String fileName) throws IOException{
        String jsonStr = "";
        File jsonFile = new File(fileName);
        FileReader fileReader = new FileReader(jsonFile);
        Reader reader = new InputStreamReader(new FileInputStream(jsonFile),"utf-8");
        int ch = 0;
        StringBuffer sb = new StringBuffer();
        while ((ch = reader.read()) != -1) {
            sb.append((char) ch);
        }
        fileReader.close();
        reader.close();
        jsonStr = sb.toString();
        return jsonStr;
    }
}
