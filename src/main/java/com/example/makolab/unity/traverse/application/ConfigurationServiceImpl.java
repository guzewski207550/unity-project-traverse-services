package com.example.makolab.unity.traverse.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.makolab.unity.traverse.models.FurnitureConfiguration;
import com.example.makolab.unity.traverse.repository.ConfigurationRepository;


@Service
public class ConfigurationServiceImpl implements ConfigurationService {

	@Autowired
	private ConfigurationRepository configurationRepository;

	@Override
	public String saveFurnitureConfiguration(FurnitureConfiguration furnitureConfiguration) {
		configurationRepository.save(furnitureConfiguration);

		return furnitureConfiguration.getId();
	}

	@Override
	public FurnitureConfiguration getFurnitureConfiguration(String configurationID) {
		FurnitureConfiguration result = configurationRepository.findOne(configurationID.toString());

		return result;
	}

}
