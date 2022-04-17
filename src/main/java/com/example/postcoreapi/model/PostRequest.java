package com.example.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostRequest {
    private String postId;
    @NotNull(message = "clientID Cannot be empty")
    private String clientId;
    @NotNull(message = "postRecipienintID Cannot be empty")
    private String receiverId;
    private String postItem;
    private String status;
}
