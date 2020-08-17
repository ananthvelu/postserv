package com.fress.post.domain.datamodel;

import com.google.cloud.firestore.annotation.PropertyName;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDO {

    @PropertyName("id")
    private String id;

    @PropertyName("firstName")
    private String firstName;

    @PropertyName("lastName")
    private String lastName;

    @PropertyName("org")
    private String org;

    @PropertyName("timeCreated")
    private String timeCreated;

    @PropertyName("timeUpdated")
    private String timeUpdated;

    @PropertyName("countryCode")
    private String countryCode;

    @PropertyName("currencyCode")
    private String currencyCode;

    @PropertyName("emailAddress")
    private String emailAddress;

    @PropertyName("phoneNumber")
    private String phoneNumber;

    @PropertyName("billingAddress")
    private String billingAddress;

    @PropertyName("shippingAddress")
    private String shippingAddress;

}
