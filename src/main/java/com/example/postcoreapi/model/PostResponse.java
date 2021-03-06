package com.example.postcoreapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostResponse {
    private String postId;
    private String clientId;
    private String receiverId;
    private String postItem;
    private String status;
}
