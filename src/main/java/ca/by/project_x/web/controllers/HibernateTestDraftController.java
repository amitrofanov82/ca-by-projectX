package ca.by.project_x.web.controllers;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.by.project_x.persistence.model.users.Users;
import lombok.extern.slf4j.Slf4j;

//TODO delete after becomes useless
@RestController
@RequestMapping("/hibtest")
@Slf4j
public class HibernateTestDraftController {

	@Autowired
	EntityManager em;
	
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Users> testHibernateog() {
        log.info("hibernate page request");
        
        //EntityManagerFactory emf = ...;
        //EntityManager em = emf.createEntityManager();
        List<Users> result = em.createQuery("SELECT u FROM Users u").getResultList();
		return result;

    }
	
}
