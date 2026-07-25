package com.projects.order.customer;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
