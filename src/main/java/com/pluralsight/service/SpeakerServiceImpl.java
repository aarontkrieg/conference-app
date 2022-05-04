package com.pluralsight.service;

import com.pluarsight.model.Speaker;
import com.pluarsight.respository.HibernateSpeakerRepositoryImpl;
import com.pluarsight.respository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("SpeakServiceImpl no args constructor");
    }


    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakServiceImpl repository consturctor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findall();
    }
    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }
}
