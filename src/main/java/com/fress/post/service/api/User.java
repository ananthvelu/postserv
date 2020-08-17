package com.fress.post.service.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class User {
    @JsonProperty(access = JsonProperty.Access.READ_ONLY, value = "id")
    private String id;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("org")
    private String org;

    @JsonProperty("timeCreated")
    private String timeCreated;

    @JsonProperty("timeUpdated")
    private String timeUpdated;

    @JsonProperty("countryCode")
    private String countryCode;

    @JsonProperty("currencyCode")
    private String currencyCode;

    @JsonProperty("emailAddress")
    private String emailAddress;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("billingAddress")
    private String billingAddress;

    @JsonProperty("shippingAddress")
    private String shippingAddress;

}
