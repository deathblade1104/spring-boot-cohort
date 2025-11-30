package  com.deathblade1104.projects.lovable_clone.entities;

import com.deathblade1104.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    Long id;
    User user;
    Plan plan;
    SubscriptionStatus status;
    String stripeCustomerId;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;
    Instant createdAt;
    Instant updatedAt;

}