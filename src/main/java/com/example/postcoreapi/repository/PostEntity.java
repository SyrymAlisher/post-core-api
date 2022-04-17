package com.example.postcoreapi.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "post")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String postId;

    @Column(nullable = false, length = 50)
    @NotNull(message = "clientID Cannot be empty")
    private String clientId;

    @Column(nullable = false, length = 50)
    @NotNull(message = "postRecipienintID Cannot be empty")
    private String receiverId;

    @Column(nullable = false, length = 50)
    private String postItem;

    @Column(nullable = false, length = 50)
    private String status;
}
