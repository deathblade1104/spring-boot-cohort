package com.deathblade1104.projects.lovable_clone.entities;

import com.deathblade1104.projects.lovable_clone.enums.ProjectMemberRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Builder
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    Project project;
    User user;
    ProjectMemberRole role;
    User InvitedBy;
    Instant invitedAt;
    Instant acceptedAt;
}
