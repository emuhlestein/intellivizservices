package com.intelliviz.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
