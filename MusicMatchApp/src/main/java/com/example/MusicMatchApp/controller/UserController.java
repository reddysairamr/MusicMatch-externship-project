package com.example.MusicMatchApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MusicMatchApp.model.User;
import com.example.MusicMatchApp.repository.UserRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	private final UserRepository userRepository ;
	
	public UserController (UserRepository userRepository) {
		this.userRepository = userRepository ;
	}
	
	@PostMapping("/submitUserDetails")
    public void submitUserDetails(@RequestParam("firstName") String fn, @RequestParam("lastName") String ln,
    		@RequestParam("email") String email, @RequestParam("password") String password, 
    		@RequestParam("phoneNumber") Integer ph, @RequestParam("city") String city,
    		@RequestParam("state") String state, @RequestParam("pinCode") Integer pc, @RequestParam ("genre") String genre, 
    		@RequestParam ("artist1") String artist1, @RequestParam("artist2") String artist2, 
    		@RequestParam("artist3") String artist3) {
        User user = new User();
        user.setFirstName(fn);
        user.setLastName(ln);
        user.setEmail(email);
        user.setPassword(password);
        user.setPhoneNumber(ph) ;
        user.setCity(city) ;
        user.setState(state);
        user.setPinCode(pc);
        user.setGenre(genre) ;
        user.setArtist1(artist1) ;
        user.setArtist2(artist2);
        user.setArtist3(artist3) ;
        
        userRepository.save(user);
        
	}	
	
	
}
