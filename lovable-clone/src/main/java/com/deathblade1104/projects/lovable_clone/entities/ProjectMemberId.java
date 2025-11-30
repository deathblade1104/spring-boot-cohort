package com.deathblade1104.projects.lovable_clone.entities;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;


@Builder
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMemberId {
    Long projectId;
    Long userId;
}
