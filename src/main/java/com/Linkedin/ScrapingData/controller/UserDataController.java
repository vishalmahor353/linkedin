package com.Linkedin.ScrapingData.controller;


import com.Linkedin.ScrapingData.entity.UserData;
import com.Linkedin.ScrapingData.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserDataController {
    @Autowired
    private UserDataService userDataService;

    @PostMapping("/scrap/store/data")
    public ResponseEntity<?> storeData(@RequestBody List<UserData> userData){
        if(userData==null){
            return ResponseEntity.badRequest().body("User Data is empty");
        }
        return new ResponseEntity<String>(userDataService.storeData(userData), HttpStatus.CREATED);
    }
}
