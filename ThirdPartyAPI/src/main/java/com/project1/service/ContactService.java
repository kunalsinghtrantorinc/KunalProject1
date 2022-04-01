package com.project1.service;

import com.project1.dto.ContactDto;
import com.project1.model.Contact;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    public List<Contact> getContact();
//    public Contact saveContact(Contact contact);
    public Contact saveContact(ContactDto contactDto);
    public void deleteContact(Long contactId);
    public Contact findByName(String firstName);
    public Contact removeContact(Long contactId);

}
