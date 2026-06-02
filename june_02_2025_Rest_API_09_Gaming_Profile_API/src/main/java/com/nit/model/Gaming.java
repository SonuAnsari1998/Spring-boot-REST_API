package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gaming {
	private Integer playerId;
	private String playerName;
	private String gameName;
	private Double score;
}
