package org.yukung.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJson;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author yukung
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@AutoConfigureJson
@AutoConfigureJsonTesters
//@AutoConfigureStubRunner
public class ConsumerSideControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private JacksonTester<Person> json;

    @Test
    public void should_give_me_a_beer_iam_old_enough() throws Exception {

    }

    @Test
    public void should_reject_a_beer_when_iam_too_young() throws Exception {

    }
}




/*
    @Test
    public void should_give_me_a_beer_iam_old_enough() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/beer")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json.write(new Person("yukung", 34)).getJson()))
                .andExpect(status().isOk())
                .andExpect(content().string("HERE YOU GO!"));
    }

    @Test
    public void should_reject_a_beer_when_iam_too_young() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.post("/beer")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content(json.write(new Person("John Doe", 17)).getJson()))
                .andExpect(status().isOk())
                .andExpect(content().string("YOU ARE KIDDING!"));
    }
*/
