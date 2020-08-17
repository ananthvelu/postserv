package com.fress.post.domain.datamodel;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.firestore.annotation.PropertyName;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class PostDO {

    @DocumentId
    @PropertyName("id")
    private String id;

    @PropertyName("userId")
    private String userId;

    @PropertyName("giver")
    private String giver;

    @PropertyName("category")
    private String category;

    @PropertyName("itemDescription")
    private String itemDescription;

    @PropertyName("title")
    private String title;

    @PropertyName("type")
    private PostType type;

    @PropertyName("ingredients")
    private List<String> ingredients;

    @PropertyName("amount")
    private String amount;

    @PropertyName("status")
    private PostStatus status;

    @PropertyName("tags")
    private List<String> tags;

    @PropertyName("interested_parties")
    private List<String> interested_parties;

    @PropertyName("foodId")
    private String foodId;

    @PropertyName("postSeenCount")
    private int postSeenCount;

    @PropertyName("totalInterestedParties")
    private String totalInterestedParties;

    public enum PostType {
        GIVE,
        ASK
    }
    public enum PostStatus {
        CANCELLED,
        CREATED,
        PROCESSING
    }
}
