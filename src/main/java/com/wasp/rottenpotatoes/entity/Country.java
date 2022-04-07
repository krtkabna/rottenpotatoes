package com.wasp.rottenpotatoes.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Country {
    private Long id;
    private String name;
}
