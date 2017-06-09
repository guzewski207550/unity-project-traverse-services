package com.example.makolab.unity.traverse.application;

import com.example.makolab.unity.traverse.models.FurnitureConfiguration;


public interface ConfigurationService {
	String saveFurnitureConfiguration(FurnitureConfiguration furnitureConfiguration);
	FurnitureConfiguration getFurnitureConfiguration(String configurationID);
}
