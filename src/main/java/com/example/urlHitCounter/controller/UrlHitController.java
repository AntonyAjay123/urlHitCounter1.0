package com.example.urlHitCounter.controller;

import com.example.urlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/visitor-count-app")
public class UrlHitController {

    HashMap<String,Integer> map = new HashMap<>();
    @RequestMapping("/username/{username}/count")
    public HashMap<String, Integer> getHitCount(@PathVariable String username) {
        int count = map.getOrDefault(username,0);
        count++;
        map.put(username,count);
        return map;

    }
}