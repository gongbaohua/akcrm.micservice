package com.avatech.edi.akcrm.B1JCO;

import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.tools.Tools;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

public class B1Manager {
    private final static Logger logger = LoggerFactory.getLogger(B1Manager.class);
    private static List<B1Connection> b1ConnectionList = null;

    public static List<B1Connection> getConfigInfo() throws IOException{
        String configFilePath = System.getProperty("user.dir")+"\\akConfig.json";
        String json = Tools.readJsonFile(configFilePath);
        if(b1ConnectionList == null){
            ObjectMapper objectMapper = new ObjectMapper();
            b1ConnectionList = objectMapper.readValue(json, new TypeReference<List<B1Connection>>(){ });
        }
        return b1ConnectionList;
    }
}
