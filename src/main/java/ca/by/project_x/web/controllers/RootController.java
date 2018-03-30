package ca.by.project_x.web.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.by.project_x.dto.catalog.Category;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/")
@Slf4j
public class RootController {


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Category>> getCatalog() {
        log.info("new main page request");
        List<Category> catalog = new ArrayList<>(3);
        Category cat1 = new Category(null,new ArrayList<>(),"Тапки","Всяки разны тапки, от домашних до похоронных");
        Category cat2 = new Category(null,new ArrayList<>(),"Деньги","Здесь вы можете купить себе ещё больше денег");
        Category cat3 = new Category(null,new ArrayList<>(),"Одеяния","Инстурменты прикрытия срамных мест");
        
        cat1.setParentCategory(cat3);
        cat3.getSubCategories().add(cat1);
        
        catalog.addAll(Arrays.asList(new Category[] {cat1, cat2, cat3}));
        
        return new ResponseEntity<>(catalog, HttpStatus.OK);
    }

}
