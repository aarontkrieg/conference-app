package com.pluarsight.respository;

import com.pluarsight.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findall();
}
