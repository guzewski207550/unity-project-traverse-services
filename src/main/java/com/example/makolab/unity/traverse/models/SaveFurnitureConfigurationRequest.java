package com.example.makolab.unity.traverse.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class SaveFurnitureConfigurationRequest {
	@Setter
	@Getter
	private List<Integer> configurationElements;
}
