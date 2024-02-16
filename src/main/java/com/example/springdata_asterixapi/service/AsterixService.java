package com.example.springdata_asterixapi.service;

import com.example.springdata_asterixapi.model.Asterix;
import com.example.springdata_asterixapi.model.dtos.AsterixDTO;
import com.example.springdata_asterixapi.repository.AsterixRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AsterixService {
    private final AsterixRepo asterixRepo;

    public List<AsterixDTO> getAll() {
        List<Asterix> temp = asterixRepo.findAll();
        List<AsterixDTO> dtoList = new ArrayList<>();
        for (Asterix s: temp) {
            AsterixDTO sdto = new AsterixDTO(s.getId(),s.getName(),s.getAge(),s.getProfession());
            dtoList.add(sdto);
        }
        return dtoList;
    }

    public Asterix save(AsterixDTO asterixDTO) {
       Asterix asterix=new Asterix(asterixDTO.getId(),asterixDTO.getName(),asterixDTO.getAge(),asterixDTO.getProfession(), UUID.randomUUID().toString());
       return asterixRepo.save(asterix);

    }
}
