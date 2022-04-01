package com.project1.dto;

import com.project1.model.Mobile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {

    private Long contactId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private String isActive;
    private List<Mobile> mobile;

}
