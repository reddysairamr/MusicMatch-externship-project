package com.example.MusicMatchApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String firstName;
	
	private String lastName; 
	
	private String email; 
	
	private String password; 
	
	private Integer phoneNumber ;
	
	private String city; 
	
	private String state; 
	
	private Integer pinCode; 
	
	private String genre ;
	private String artist1 ;
	private String artist2 ;
	private String artist3 ;
	
	public User() {
	}
		
	public User(Integer id, String firstName, String lastName, String email, String password, Integer phoneNumber, String city, String state,
			Integer pinCode, String genre,  String artist1, String artist2  , String artist3 ) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber ;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.genre = genre ;
		this.artist1 = artist1 ;
		this.artist2 = artist2; 
		this.artist3 = artist3 ;

	}

	public void setId (Integer id) {
		this.id = id ;
	}
	
	public void setFirstName (String fn) {
		this.firstName = fn ;
	}
	public void setLastName (String ln) {
		this.lastName = ln ;
	}
	public void setEmail (String email) {
		this.email = email ;
	}
	public void setPassword (String password) {
		this.password = password ;
	}
	public void setCity (String city) {
		this.city = city ;
	}
	public void setState (String state) {
		this.state = state ;
	}
	public void setPinCode (Integer pinCode) {
		this.pinCode = pinCode ;
	}
	
	public Integer getId () {
		return id ;
	}
	public String getFirstName () {
		return firstName ;
	}
	public String getLastName () {
		return lastName ;
	}
	public String getEmail () {
		return email ;
	}
	public String getPassword () {
		return password ;
	}
	public String getCity () {
		return city ;
	}
	public String getState () {
		return state ;
	}
	public Integer getPinCode () {
		return pinCode ;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getArtist1() {
		return artist1;
	}

	public void setArtist1(String artist1) {
		this.artist1 = artist1;
	}

	public String getArtist2() {
		return artist2;
	}

	public void setArtist2(String artist2) {
		this.artist2 = artist2;
	}

	public String getArtist3() {
		return artist3;
	}

	public void setArtist3(String artist3) {
		this.artist3 = artist3;
	}
}
