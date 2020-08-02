package com.manjunath.com.manjunath.service;

import com.manjunath.model.Speaker;
import com.manjunath.repository.HibernateSpeakerRepositoryImpl;
import com.manjunath.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("speakerService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

    // @Autowired reflection based dependency injection not recommended
    private SpeakerRepository repository;

    @Autowired
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
    // @Autowired
    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.repository = speakerRepository;
        System.out.println("SpeakerServiceImpl setter");
    }
}
