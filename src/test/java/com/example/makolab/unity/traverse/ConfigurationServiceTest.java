package com.example.makolab.unity.traverse;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.makolab.unity.traverse.application.ConfigurationService;
import com.example.makolab.unity.traverse.models.FurnitureConfiguration;

public class ConfigurationServiceTest {
	private final static String CONFIGURATION_ID = "checked";
	
	@Mock
	private ConfigurationService configurationService;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		
		when(configurationService.saveFurnitureConfiguration(Matchers.<FurnitureConfiguration>any())).thenReturn(CONFIGURATION_ID);
		when(configurationService.getFurnitureConfiguration(any())).thenReturn(makeFurnitureConfiguration());
	}
	
	@Test
	public void saveMethodShouldReturnConfigurationID(){				
		String result = configurationService.saveFurnitureConfiguration(makeFurnitureConfiguration());
		
		assertEquals(CONFIGURATION_ID, result);
	}
	
	@Test
	public void getMethodShouldReturnFurnitureConfiguration(){		
		FurnitureConfiguration furnitureConfiguration = configurationService.getFurnitureConfiguration(CONFIGURATION_ID);
		
		List<Integer> expectedConfiguration = makeFurnitureConfiguration().getConfigurationElements();
		List<Integer> result = furnitureConfiguration.getConfigurationElements();
		
		assertEquals(expectedConfiguration, result);
	}
	
	private FurnitureConfiguration makeFurnitureConfiguration(){		
		List<Integer> configuration = new ArrayList<>();
		configuration.add(2);
		configuration.add(3);
		configuration.add(1);
		
		FurnitureConfiguration furnitureConfiguration = new FurnitureConfiguration(configuration);
		
		return furnitureConfiguration;
	}
	
}
