package com.fress.post.domain.datamodel;

import com.google.cloud.firestore.annotation.PropertyName;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AddressDO {

    @PropertyName("type")
    private String type;

    @PropertyName("postalCode")
    private String postalCode;

    @PropertyName("addressLine1")
    private String addressLine1;

    @PropertyName("addressLine2")
    private String addressLine2;

    @PropertyName("city")
    private String city;

    @PropertyName("state")
    private String state;

    @PropertyName("country")
    private String country;
}
