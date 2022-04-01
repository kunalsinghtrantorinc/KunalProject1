package com.project1.dto;

import com.project1.model.ExternalContactEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ExternalMobileDto {

    private Long mobileId;

    private String mobileNumber;

    private String countryCode;

    private String type;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private Integer contactId;

    private ExternalContactEntity contactEntity;
}
