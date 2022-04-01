package com.project1.service.impl;

import com.project1.dto.ContactDto;
import com.project1.mapper.Mapper;
import com.project1.model.Contact;
import com.project1.repo.ContactRepo;
import com.project1.service.ContactService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public List<Contact> getContact() {
        return contactRepo.findAll();
    }



    @Override
    public Contact saveContact(ContactDto contactDto) {
        return contactRepo.save(Mapper.INSTANCE.entityToDto(contactDto));
    }

    @Override
    public void deleteContact(Long contactId) {
        contactRepo.deleteById(contactId);
    }

    @Override
    public Contact findByName(String firstName) {
        return contactRepo.findByFirstName(firstName);
    }

    @Override
    public Contact removeContact(Long contactId) {
        Contact contact = contactRepo.findById(contactId)
                        .orElseThrow(() -> new ResourceNotFoundException("contact not found for this id :: "
                                + contactId));
        contact.setIsActive("N");
        Contact save = contactRepo.save(contact);
        return save;
    }


}
