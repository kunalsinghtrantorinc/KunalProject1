package com.project1.mapper;

import com.project1.dto.ContactDto;
import com.project1.model.Contact;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-01T15:48:56+0530",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
public class MapperImpl implements Mapper {

    @Override
    public Contact entityToDto(ContactDto contactDto) {
        if ( contactDto == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setContactId( contactDto.getContactId() );
        contact.setFirstName( contactDto.getFirstName() );
        contact.setLastName( contactDto.getLastName() );
        contact.setEmailAddress( contactDto.getEmailAddress() );
        contact.setCreatedBy( contactDto.getCreatedBy() );
        contact.setCreatedDate( contactDto.getCreatedDate() );
        contact.setUpdatedBy( contactDto.getUpdatedBy() );
        contact.setUpdatedDate( contactDto.getUpdatedDate() );
        contact.setIsActive( contactDto.getIsActive() );

        return contact;
    }

    @Override
    public ContactDto dtoToEntity(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setContactId( contact.getContactId() );
        contactDto.setFirstName( contact.getFirstName() );
        contactDto.setLastName( contact.getLastName() );
        contactDto.setEmailAddress( contact.getEmailAddress() );
        contactDto.setCreatedBy( contact.getCreatedBy() );
        contactDto.setCreatedDate( contact.getCreatedDate() );
        contactDto.setUpdatedBy( contact.getUpdatedBy() );
        contactDto.setUpdatedDate( contact.getUpdatedDate() );
        contactDto.setIsActive( contact.getIsActive() );

        return contactDto;
    }
}
