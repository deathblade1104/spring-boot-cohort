package com.deathblade1104.projects.lovable_clone.entities;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Builder
public class ProjectFile {
    Long id;
    Project project;
    String path;
    String minioObjectKey;
    Instant createdAt;
    Instant updatedAt;
    User createdBy;
    User updatedBy;

}
