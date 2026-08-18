package com.ra.session14.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class JwtResponse {
    private String username;
    private String type;
    private String access_token;
}
