package com.ivanskiy.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
public class TestMap {
    String url = "http://127.0.0.1:8013/homework/";
    @Test
    public void getMap() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        HashMap<String,Integer> testMap = objectMapper.readValue(new URL(url), HashMap.class);
        System.out.println(testMap);

    }
}