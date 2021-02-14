package com.ivanskiy.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanskiy.rest.entity.User;
import com.ivanskiy.rest.storage.HomeworkList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;

@RunWith(SpringRunner.class)
public class TestGetUserInfoUseEmail {
    @Test
    public void  getUserInfoByEmail() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String url = "http://127.0.0.1:8081/find/user/email?email=oleh@site.com";
        User user = objectMapper.readValue(new URL(url), User.class);
        Assert.assertEquals("Alex",user.getName());
        Assert.assertEquals(LocalDate.of(1212,03,17),user.getLastLoginDate());
        Assert.assertEquals("true",user.getListOfHomeworkToIsDone().get(HomeworkList.ARRAYS));
    }
}
