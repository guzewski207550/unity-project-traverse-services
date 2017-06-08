package com.example.makolab.unity.traverse.models;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
public class SaveFurnitureConfigurationRequest {
	@Setter
	@Getter
	private List<Integer> configurationElements;
}
