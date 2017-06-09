package com.example.makolab.unity.traverse.endpoints;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.makolab.unity.traverse.application.ConfigurationService;
import com.example.makolab.unity.traverse.models.FurnitureConfiguration;
import com.example.makolab.unity.traverse.models.SaveFurnitureConfigurationRequest;

@Controller
@RestController
@RequestMapping("/furniture")
public class FurnitureEndpoint {

	private static final String CONFIGURATION_ID = "configurationID";

	@Autowired
	private ConfigurationService configurationService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Map<String, String>> saveFurnitureConfiguration(
			@RequestBody SaveFurnitureConfigurationRequest saveFurnitureConfigurationRequest) {
		FurnitureConfiguration furnitureConfiguration = new FurnitureConfiguration(
				saveFurnitureConfigurationRequest.getConfigurationElements());

		Map<String, String> result = new HashMap<>();
		result.put(CONFIGURATION_ID, configurationService.saveFurnitureConfiguration(furnitureConfiguration));

		return new ResponseEntity<Map<String, String>>(result, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/get/{configurationID}", method = RequestMethod.GET)
	public ResponseEntity<FurnitureConfiguration> getFurnitureConfiguration(
			@PathVariable(CONFIGURATION_ID) String configurationID) {
		FurnitureConfiguration result = configurationService.getFurnitureConfiguration(configurationID);

		return new ResponseEntity<FurnitureConfiguration>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/save/{configurationID}", method = RequestMethod.PUT)
	public ResponseEntity<Map<String, String>> updateFurnitureConfiguration(
			@RequestBody SaveFurnitureConfigurationRequest saveFurnitureConfigurationRequest,
			@PathVariable(CONFIGURATION_ID) String configurationID) {
		FurnitureConfiguration furnitureConfiguration = configurationService.getFurnitureConfiguration(configurationID);
		furnitureConfiguration.setConfigurationElements(saveFurnitureConfigurationRequest.getConfigurationElements());
		
		Map<String, String> result = new HashMap<>();
		result.put(CONFIGURATION_ID, configurationService.saveFurnitureConfiguration(furnitureConfiguration));
		
		return new ResponseEntity<Map<String, String>>(result, HttpStatus.OK);
	}
}
