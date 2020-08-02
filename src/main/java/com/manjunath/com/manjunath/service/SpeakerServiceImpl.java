package com.manjunath.com.manjunath.service;

import com.manjunath.model.Speaker;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
        System.out.println("SpeakerServiceImpl repository constructor");
    }

    // empty constructor for setter injection
    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl no args constructor");
    }
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // using setter injection
    @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
        System.out.println("SpeakerServiceImpl setter");
    }
}
