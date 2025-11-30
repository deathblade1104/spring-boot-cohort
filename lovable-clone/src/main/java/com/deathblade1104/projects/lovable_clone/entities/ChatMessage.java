package com.deathblade1104.projects.lovable_clone.entities;

import com.deathblade1104.projects.lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Builder
public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    String toolCalls;
    MessageRole role;
}
