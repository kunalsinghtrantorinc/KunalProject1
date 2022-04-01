package com.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mobile")
public class Mobile {

    @Id
    @Column(name = "MOBILE_ID")
    private Long mobileId;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "COUNTRY_CD")
    private String countryCd;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @CreationTimestamp
    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    @Column(name = "UPDATED_DATE", nullable = false)
    private Date updatedDate;

}
