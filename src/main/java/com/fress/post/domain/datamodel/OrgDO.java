package com.fress.post.domain.datamodel;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.PropertyName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrgDO {
    @DocumentId
    @PropertyName("id")
    private String id;

    @PropertyName("country")
    private String country;

    @PropertyName("state")
    private String state;

    @PropertyName("postalCode")
    private String postalCode;

    @PropertyName("city")
    private String city;

    @PropertyName("name")
    private String name;
}
