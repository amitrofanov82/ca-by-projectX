package ca.by.project_x.web.controllers.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v2/user")
@Slf4j
public class UsersController {

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path="{id}")
    public ResponseEntity<String> getUser(@PathVariable Long id) {
        log.debug("get user by id request");
        System.out.println("User requested with id = " + id);
        
        return new ResponseEntity<>("{}", HttpStatus.OK);
    }

}
