package com.project1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="contact")
public class Contact {


//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "CONTACT_ID")
    private Long contactId;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @CreationTimestamp
    @Column(name = "CREATED_DATE" , nullable = false)
    private Date createdDate;
    @Column(name = "UPDATED_BY")
    private String updatedBy;
    @UpdateTimestamp
    @Column(name = "UPDATED_DATE",nullable = false)
    private Date updatedDate;
    @Column(name = "IS_ACTIVE")
    private String isActive;

    @OneToMany(targetEntity = Mobile.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "CONTACT_ID", referencedColumnName = "CONTACT_ID")
    private List<Mobile> mobiles;

}
