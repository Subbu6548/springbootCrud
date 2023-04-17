package com.weareforyou.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.weareforyou.entity.Details;

@Service
public interface WeareforyouService {

	public Details saveDetails(Details details);
	
	public List<Details> getDetails();
	
}
