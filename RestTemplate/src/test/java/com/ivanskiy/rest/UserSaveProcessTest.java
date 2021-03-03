package com.ivanskiy.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanskiy.rest.model.User;
import org.junit.Assert;
import org.junit.Test;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

public class UserSaveProcessTest {

    @Test
    public void getUserInfoByEmail() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String url = "http://127.0.0.1:8081/user/search?email=alex@site.com";
        User user = objectMapper.readValue(new URL(url), User.class);
        Assert.assertEquals("Alex", user.getName());
        Assert.assertEquals(LocalDate.of(1212, 03, 17), user.getLastLoginDate());
    }
}
