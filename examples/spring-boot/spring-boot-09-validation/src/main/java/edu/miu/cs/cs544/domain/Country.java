package edu.miu.cs.cs544.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Country")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter 
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Country {
	
	@Id
	@Size(max = 2, min = 2)
	private String countryRegionCode;
	
	@NotNull
	private String name;
	
	private LocalDate modifiedDate;
	
}
