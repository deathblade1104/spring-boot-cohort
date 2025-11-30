package com.deathblade1104.projects.lovable_clone.entities;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level =  AccessLevel.PRIVATE)
@Getter
@Builder
public class Plan{
    Long id;
    String name;
    String stripePriceId;
    //Used Integer and not int because it is easier to make these fields nullable.a
    Integer maxProjects;
    Integer maxTokensPerDay;
    Integer maxPreviews;
    Boolean unlimitedAi;
    Boolean active;
}