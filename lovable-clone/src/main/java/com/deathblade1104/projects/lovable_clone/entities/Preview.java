package com.deathblade1104.projects.lovable_clone.entities;

import com.deathblade1104.projects.lovable_clone.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Builder
public class Preview {
    Long id;
    Project project;
    String namespace;
    String podName;
    String previewUrl;
    PreviewStatus previewStatus;
    Instant startedAt;
    Instant terminatedAt;
    Instant createdAt;
}