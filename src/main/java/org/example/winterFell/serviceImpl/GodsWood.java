package org.example.winterFell.serviceImpl;

import org.example.winterFell.service.JohnSnowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GodsWood {

    @Autowired
    JohnSnowService johnSnowService;
    public int godsWoodCheck() {
        int check = johnSnowService.familyChart();
        System.out.print("bela chio!");
        return check;
    }
}
