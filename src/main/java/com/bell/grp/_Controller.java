package com.example.restservice;

import java.util.Random;
//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	Random random = new Random();

	@GetMapping("/")
    public ResponseEntity<User> getUser()  throws InterruptedException{
		User user = new User(" "," ");
    	Thread.sleep(1000+random.nextInt(1000));
    	//return ResponseEntity.ok(user);
    	return new ResponseEntity<>(user, HttpStatus.OK);
    	
    }
    @PostMapping(path="/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> user(@RequestBody User user) throws InterruptedException {
    	
			User usr = new User(user.getLogin(),user.getPassword());
			Thread.sleep(1000+random.nextInt(1000));
			return new ResponseEntity<>(usr, HttpStatus.OK);
			//return ResponseEntity.ok(usr);
			
    }
   /* @GetMapping("/advanced-data")
    public ResponseEntity<User> getAdvancedData() {
        User someObject = new User("advanced", "84");
        // HTTP-статус в маршруте!
        return new ResponseEntity<>(someObject, HttpStatus.OK);
    }*/
    /*@PostMapping(path="/home", consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> getAdvancedData() {
        User obj = new User(String.format(obj.getLogin()), String.format(obj.getPassword()));

    //public User user1(String login,String password,@RequestBody User user1) throws InterruptedException {
    	//Thread.sleep(1000+random.nextInt(1000));
    	
    	return new ResponseEntity<>(obj, HttpStatus.OK);
    }*/
	
}
