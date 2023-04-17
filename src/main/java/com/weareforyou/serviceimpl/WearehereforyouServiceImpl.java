package com.weareforyou.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weareforyou.entity.Details;
import com.weareforyou.repository.WeareforyouRepo;
import com.weareforyou.service.WeareforyouService;

@Service
public class WearehereforyouServiceImpl implements WeareforyouService {
	
	@Autowired
	private WeareforyouRepo weareforyourepo;

	@Override
	public Details saveDetails(Details details) {
		
		Details saveddetails=weareforyourepo.save(details);
		
		
		return saveddetails;
	}

	@Override
	public List<Details> getDetails() {
		List<Details> details=weareforyourepo.findAll();
		return details;
	}

}
