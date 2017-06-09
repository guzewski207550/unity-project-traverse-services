package com.example.makolab.unity.traverse.models;

import java.util.List;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Document(collection = "furnitureConfigurations")
@ToString
public class FurnitureConfiguration {
	@Id
	@Getter
	private String id;

	@Setter
	@Getter
	private List<Integer> configurationElements;

	public FurnitureConfiguration(List<Integer> configurationElements) {
		this.id = UUID.randomUUID().toString();
		this.configurationElements = configurationElements;
	}
}
