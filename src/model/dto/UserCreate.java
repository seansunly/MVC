package model.dto;

import lombok.Builder;

@Builder
public record UserCreate(
        Integer id,
        String name,
        String email
) {
}
