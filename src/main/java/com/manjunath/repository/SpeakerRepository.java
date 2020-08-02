package com.manjunath.repository;

import com.manjunath.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
