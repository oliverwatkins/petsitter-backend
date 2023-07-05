package com.petsitter.entity;

import com.petsitter.model.UserRole;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@Data
@Entity
@Table(name = "user")
public class UserEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole role;

	@Column(nullable = false)
	private String password;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private List<PetEntity> pets = new ArrayList<>();

	@Column(nullable = false, unique = true)
	private String userName;

	@Column(nullable = true, unique = false, name = "geo_lat")
	private double latitude;

	@Column(nullable = true, unique = false, name = "geo_lng")
	private double longitutde;

	public UserEntity() {
		super();
	}

	public UserEntity(String userName) {
		super();
		this.userName = userName;
	}
}
