package com.ogulcan.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Post extends BaseEntity{

    @Id
    private String id;
    private String userId;
    private String title;
    private String content;
    private String mediaUrl;
    private int like;
    private int dislike;
}
