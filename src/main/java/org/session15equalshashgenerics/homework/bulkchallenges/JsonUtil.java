package org.session15equalshashgenerics.homework.bulkchallenges;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JsonUtil {

    private JsonUtil() {
        throw new IllegalStateException("Utility class should not be instantiated.");
    }

    public static String returnJson(Student student) {
        return student.toString();
    }
}

class TestJsonUtil {

    public static void main(String[] args) {
        Student charlie = new Student();
        charlie.setName("Charlie");
        charlie.setAge(22);
        charlie.setStudentID(231);
        charlie.setEmail("c@student.com");

        String jsonString = JsonUtil.returnJson(charlie);
        System.out.println(jsonString);

        try {
            String filePath = "src/main/java/org/session15/homework/easychallenges/output.json";
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(jsonString);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
