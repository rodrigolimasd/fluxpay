package com.rodtech.fluxpay.application.dtos;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private UUID id;
    private BigDecimal amount;
    private String currency;
    private String description;
    private CardDTO card;
}
