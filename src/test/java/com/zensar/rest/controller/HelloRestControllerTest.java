package com.zensar.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {
	
	@Autowired//to enable autpwiring for mock mvc
	private MockMvc mock;//mock mvc is the class given by spring mvc todo testing of spring controller
	@Test
	public void getmessageTest() throws Exception 
	{
		mock.perform(MockMvcRequestBuilders.get("/hello")).andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().string("Welcome to Tomcat Server"));
		
	}
	@Test
    private void createMessageTest() throws Exception {
	  mock.perform(MockMvcRequestBuilders.post("/hello").content("welcome")).
	  andExpect(MockMvcResultMatchers.status().isCreated())
	  .andExpect(MockMvcResultMatchers.content().string("Message created"));
  }
}