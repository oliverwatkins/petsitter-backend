package com.petsitter.entity;

import com.petsitter.model.PetType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
//@Data
@Entity
@Table(name = "pet")
public class PetEntity {


	@ManyToOne
	private UserEntity user = new UserEntity();

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true)
	private String name;

	@Column(nullable = false, unique = true)
	@Enumerated(EnumType.STRING)
	private PetType type;


	public PetEntity() {
		super();
	}

	public PetEntity(UserEntity user) {
		super();
		this.user = user;
	}
}
