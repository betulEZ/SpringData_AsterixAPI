package com.example.springdata_asterixapi.controller;

import com.example.springdata_asterixapi.model.Asterix;
import com.example.springdata_asterixapi.model.dtos.AsterixDTO;
import com.example.springdata_asterixapi.repository.AsterixRepo;
import com.example.springdata_asterixapi.service.AsterixService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class AsterixController {

    private final AsterixRepo asterixRepo;
    private final AsterixService asterixService;

    @GetMapping
    public List<Asterix> getAsterix() {
        return asterixRepo.findAll();
    }
    @GetMapping("/all")
    public List<AsterixDTO> getAll(){
        return asterixService.getAll();
    }

    @PostMapping
    public Asterix save(@RequestBody Asterix character){
        return asterixRepo.save(character);
    }
    @PostMapping("/save")
    public Asterix saveAll(@RequestBody AsterixDTO asterixDTO){
        return asterixService.save(asterixDTO);
    }

    @DeleteMapping("/{id}")
    public Asterix delete(@RequestParam String id){
        return  asterixService.delete(id);

    }


}
