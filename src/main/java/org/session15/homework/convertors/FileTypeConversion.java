package org.session15.homework.convertors;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class FileTypeConversion {

    public static void convertXmlToJson(String xmlFilePath, String jsonFilePath) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            JsonNode rootNode = xmlMapper.readTree(new File(xmlFilePath));
            ObjectMapper jsonMapper = new ObjectMapper();

            jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonMapper.writeValue(new File(jsonFilePath), rootNode);
            System.out.println("XML to JSON conversion completed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TestXmlToJson {

    public static void main(String[] args) {
        String xmlFilePath = "D:/40_Java/itschool/src/main/java/org/session15/homework/convertors/filexml.xml";
        String jsonFileParth = "D:/40_Java/itschool/src/main/java/org/session15/homework/convertors/filejson.json";

        FileTypeConversion.convertXmlToJson(xmlFilePath, jsonFileParth);
    }
}
