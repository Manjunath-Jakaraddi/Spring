package com.manjunath.repository;

import com.manjunath.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("Manjunath");
        speaker.setLastName("Jakaraddi");

        speakers.add(speaker);

        return speakers;
    }
}
