package com.deathblade1104.projects.lovable_clone.entities;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Getter
public class UsageLogs {
    Long id;
    Project project;
    User user;
    String action;
    Integer tokensUsed;
    Integer durationInMilliseconds;
    String metaData;
    Instant createdAt;
}
