package com.manjunath.repository;

import com.manjunath.model.Speaker;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("dev")
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
