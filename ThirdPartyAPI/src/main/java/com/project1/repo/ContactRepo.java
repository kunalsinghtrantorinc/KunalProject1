package com.project1.repo;

import com.project1.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {

    public Contact findByFirstName(String firstName);
}
