package com.ogulcan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateNewPostRequestDto {

    private String userId;
    private String username;
    private String title;
    private String content;
    private String mediaUrl;
}
