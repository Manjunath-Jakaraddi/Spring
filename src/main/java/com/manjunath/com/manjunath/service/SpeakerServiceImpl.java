package com.manjunath.com.manjunath.service;

import com.manjunath.model.Speaker;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    // hard coded makes code brittle have to change and rebuild application
    // when another implementation of the repository is available whereas if it
    // was a configuration we could just replace it
    private SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
