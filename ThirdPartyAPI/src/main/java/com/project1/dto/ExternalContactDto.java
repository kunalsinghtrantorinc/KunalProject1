package com.project1.dto;

import com.project1.model.ExternalMobileEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExternalContactDto {
    private Long contactId;

    private String firstName;

    private String lastName;

    private String emailAddress;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private List<ExternalMobileEntity> mobileEntities;

    private String isActive;
}
