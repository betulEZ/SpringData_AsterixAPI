package com.example.springdata_asterixapi.service;

import com.example.springdata_asterixapi.model.Asterix;
import com.example.springdata_asterixapi.model.dtos.AsterixDTO;
import com.example.springdata_asterixapi.repository.AsterixRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AsterixServiceTest {
    private final AsterixRepo asterixRepo = mock(AsterixRepo.class);
    private final IdService idMock = mock(IdService.class);
    AsterixService asterixService=new AsterixService(asterixRepo,idMock);

    @Test
    void getAll() {
        //GIVEN
        Asterix asterix1 = new Asterix("1", "Test1", 5, "hmj", "kjhlk");
        Asterix asterix2 = new Asterix("2", "Test1", 5, "hmj", "kjhlk");
        List<Asterix> asterixs = List.of(asterix1, asterix2);
        when(asterixRepo.findAll()).thenReturn(asterixs);

        AsterixDTO asterixDto1 = new AsterixDTO("1", "Test1",5,"hmj");
        AsterixDTO asterixDto2 = new AsterixDTO("2", "Test1",5,"hmj");
        List<AsterixDTO> expected = new ArrayList<>();
        expected.add(asterixDto1);
        expected.add(asterixDto2);

        //WHEN
        List<AsterixDTO> actual = asterixService.getAll();
        //THEN
        assertEquals(expected, actual);
        verify(asterixRepo).findAll();

    }

    @Test
    void save() {

    }
}
