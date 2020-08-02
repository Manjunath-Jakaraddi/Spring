package com.manjunath.com.manjunath.service;

import com.manjunath.model.Speaker;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    // empty constructor for setter injection
    public SpeakerServiceImpl() {

    }
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // using setter injection
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
    }
}
