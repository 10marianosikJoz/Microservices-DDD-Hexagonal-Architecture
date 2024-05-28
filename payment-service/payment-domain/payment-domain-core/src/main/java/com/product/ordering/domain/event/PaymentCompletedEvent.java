package com.product.ordering.domain.event;

import com.product.ordering.domain.entity.Payment;

import java.time.Instant;
import java.util.Collections;

public final class PaymentCompletedEvent extends PaymentEvent {

    public PaymentCompletedEvent(final Payment payment,
                                 final Instant createdAt) {

        super(payment, createdAt, Collections.emptyList());
    }
}