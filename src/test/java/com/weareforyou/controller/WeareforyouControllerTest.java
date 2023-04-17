package com.weareforyou.controller;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.weareforyou.entity.Details;
import com.weareforyou.service.WeareforyouService;


@RunWith(SpringRunner.class)
@WebMvcTest(Weareforyou.class)
public class WeareforyouControllerTest {
	
	@Autowired
    private MockMvc mvc;
	
	@MockBean
	private WeareforyouService weservice;
	
	@Test
	public void saveDetails() throws Exception
	{
		Details detail = new Details();
		detail.setId(1L);
		detail.setName("subbu");
		detail.setEmail("subbu6548@gmail.com");
		detail.setPhnumber(9398488280L);
		detail.setAmount(230L);
		detail.setType("visa");
		detail.setCardn(7438992021L);
		detail.setExp(LocalDate.of(2015, Month.FEBRUARY, 11));
		detail.setCvv(765L);
		when(weservice.saveDetails(detail)).thenReturn(detail);
		
	} 
	@Test
	public void getDetails() throws Exception
	{
		Details detail = new Details();
		detail.setId(1L);
		detail.setName("subbu");
		detail.setEmail("subbu6548@gmail.com");
		detail.setPhnumber(9398488280L);
		detail.setAmount(230L);
		detail.setType("visa");
		detail.setCardn(7438992021L);
		detail.setExp(LocalDate.of(2015, Month.FEBRUARY, 11));
		detail.setCvv(765L);
		
		Details detail1=new Details();
		detail1.setId(2L);
		detail1.setName("badri");
		detail1.setEmail("subbu@gmail.com");
		detail1.setPhnumber(8787729373L);
		detail1.setAmount(230L);
		detail1.setType("mastercard");
		detail1.setCardn(686877773L);
		detail1.setExp(LocalDate.of(2015, Month.FEBRUARY, 25));
		detail1.setCvv(765L);
		
		List<Details> details=new ArrayList<Details>();
		details.add(detail);
		details.add(detail1);
		when(weservice.getDetails()).thenReturn(details);

		mvc.perform(get("/getdetails").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(2));

	}
	
	 

	
}

