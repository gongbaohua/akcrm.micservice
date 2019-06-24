package com.avatech.edi.akcrm.B1JCO;

import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.service.Config.ServiceException;
import com.avatech.edi.akcrm.tools.Tools;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.util.List;

@Component
@Slf4j
public class B1Manager {
    private static final String COMPANY_INFO_CONFIG_PATH = "C:\\avatech\\config\\companyinfo.json";

    private static List<B1Connection> b1Connections;

    private List<B1Connection> getB1Connections() throws IOException {
        File file = new File(COMPANY_INFO_CONFIG_PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file); // 建立一个输入流对象fileReader
            bufferedReader = new BufferedReader(fileReader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
            StringBuffer stringBuffer = new StringBuffer();
            String line = bufferedReader.readLine().trim();
            while (line != null) {
                stringBuffer.append(line);
                line = bufferedReader.readLine(); // 一次读入一行数据
            }
            ObjectMapper mapper = new ObjectMapper();
            List<B1Connection> companyInfos = mapper.readValue(stringBuffer.toString(), new TypeReference<List<B1Connection>>() {});
            return companyInfos;
        } catch (IOException e) {
            log.info("读取配置文件出错", e);
            throw new ServiceException("50002", "读取配置文件出错");
        } finally {
            if (null != bufferedReader) bufferedReader.close();
            if(null != fileReader) fileReader.close();
        }
    }

    public B1Connection getB1ConnInstance(String companyName){
        B1Connection connection = null;
        try{
            if(b1Connections == null || b1Connections.size() == 0){
                b1Connections = getB1Connections();
            }
            for (B1Connection conn:b1Connections) {
                if(companyName.equals(conn.getCompanyName())){
                    connection = conn;
                }
            }
        }catch (Exception e){
            throw new ServiceException("50003","公司信息配置信息匹配异常");
        }
        if(connection == null){
            throw new ServiceException("50004","未找到匹配的公司信息");
        }
        return connection;
    }
}
