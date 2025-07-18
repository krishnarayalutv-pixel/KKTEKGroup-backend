package com.kktekgroup.website.Dto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDto {
    private String fullName;
    private String email;
    private String company;
    private String subject;
    private String message;
}
