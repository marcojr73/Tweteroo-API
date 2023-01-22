package com.tweteroo.tweteroo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TweetsDto(
        @NotBlank String userName,
        @NotNull String tweet) {

}
