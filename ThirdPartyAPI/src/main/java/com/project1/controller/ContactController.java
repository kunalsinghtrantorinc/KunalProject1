package com.project1.controller;

import com.project1.dto.ContactDto;
import com.project1.dto.ExternalContactDto;
import com.project1.externalService.ExternalServiceApis;
import com.project1.model.Contact;
import com.project1.repo.ContactRepo;
import com.project1.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @Autowired
    private ExternalServiceApis externalServiceApis;

    @GetMapping("/findByName/{firstName}")
    public Contact findByName(@PathVariable String firstName) {
        return contactService.findByName(firstName);
    }
    @GetMapping("/findAllContacts")
    public List<Contact> getContact2() {
        return  contactService.getContact();

    }

    @GetMapping("/findAllContacts/{isActive}")
    public ResponseEntity<?> getContact(@PathVariable String isActive) {
        if (isActive.equalsIgnoreCase("true")) {
            return new ResponseEntity(externalServiceApis.externalFindAll(), HttpStatus.OK);
        }
        return new ResponseEntity( contactService.getContact(), HttpStatus.OK);
    }

    @PostMapping("/addContact")
    public Contact saveContact(@RequestBody ContactDto contactDto) {
        return contactService.saveContact(contactDto);
    }

    @PutMapping("/removeContact/{contactId}")
    public Contact removeContact(@PathVariable Long contactId){
        return contactService.removeContact(contactId);
    }

    @DeleteMapping("/deleteContactFromDb")
    public String deleteContact(Long contactId) {
        contactService.deleteContact(contactId);
        return "Data Deleted!";
    }

    @GetMapping("/externalFindAll")
    public String externalFindAll() {
        return externalServiceApis.externalFindAll();
    }

    @PostMapping("/externalSave")
    public String externalSave(@RequestBody ExternalContactDto externalContactDto) {
        return externalServiceApis.externalSave(externalContactDto);
    }

    @GetMapping("/externalFindAll/{firstName}")
    public String externalSearchByName(@PathVariable String firstName) {
        return externalServiceApis.externalSearchByFirstName(firstName);
    }

    @PutMapping("/externalUpdate/{id}")
    public String externalUpdate(@PathVariable Long id) {
        return externalServiceApis.externalUpdate(id);
    }

}
