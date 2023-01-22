package com.tweteroo.tweteroo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserDto(
        @NotBlank String userName,
        @NotNull String avatar) {

}
