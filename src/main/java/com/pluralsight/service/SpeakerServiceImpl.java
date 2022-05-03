package com.pluralsight.service;

import com.pluarsight.model.Speaker;
import com.pluarsight.respository.HibernateSpeakerRepositoryImpl;
import com.pluarsight.respository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {


    private SpeakerRepository respository;

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        respository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return respository.findall();

    }

    public void setRespository(SpeakerRepository respository) {
        this.respository = respository;
    }
}
