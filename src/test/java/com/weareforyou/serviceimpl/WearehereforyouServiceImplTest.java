package com.weareforyou.serviceimpl;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.weareforyou.entity.Details;
import com.weareforyou.repository.WeareforyouRepo;
@RunWith(SpringRunner.class)
public class WearehereforyouServiceImplTest {
	
	@InjectMocks
	private WearehereforyouServiceImpl weserimpl;
	
	@Mock
	private WeareforyouRepo werepo;
	
	@Before
	public void setUp()
	{
		Details detail=new Details();
		detail.setId(1L);
		detail.setName("subbu");
		detail.setEmail("subbu6548@gmail.com");
		detail.setPhnumber(9398488280L);
		detail.setAmount(230L);
		detail.setType("visa");
		detail.setCardn(7438992021L);
		detail.setExp(LocalDate.of(2015, Month.FEBRUARY, 11));
		detail.setCvv(765L);
		Mockito.when(werepo.save(detail)).thenReturn(detail);
		
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
		Mockito.when(werepo.findAll()).thenReturn(details);
			

	}
	@Test
	public void saveDetails()
	{
		Details detail=new Details();
		detail.setId(1L);
		weserimpl.saveDetails(detail);
		verify(werepo, times(1)).save(detail);
		
	}
	@Test
	public void getDetails() {

		List<Details> details = weserimpl.getDetails();
		Assert.assertEquals(details.size(), 2);
	}

}
