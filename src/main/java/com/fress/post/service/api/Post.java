package com.fress.post.service.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Post {

    @JsonProperty("id")
    private String id;

    @JsonProperty("userId")
    private String userId;

    @JsonProperty("giver")
    private String giver;

    @JsonProperty("category")
    private String category;

    @JsonProperty("itemDescription")
    private String itemDescription;

    @JsonProperty("title")
    private String title;

    @JsonProperty("type")
    private PostType type;

    @JsonProperty("ingredients")
    private List<String> ingredients;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("status")
    private PostStatus status;

    @JsonProperty("tags")
    private List<String> tags;

    @JsonProperty("interested_parties")
    private List<String> interested_parties;

    @JsonProperty("foodId")
    private String foodId;

    @JsonProperty("postSeenCount")
    private int postSeenCount;

    @JsonProperty("totalInterestedParties")
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
