package com.ub.inventoryfailover.web.controller;

import com.ub.brewery.model.BeerInventoryDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@RequestMapping("/inventory-failover")
@RestController
public class InventoryFailoverController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Mono<List<BeerInventoryDto>> listInventory() {
        return Mono.just(List.of(BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build()));
    }
}
