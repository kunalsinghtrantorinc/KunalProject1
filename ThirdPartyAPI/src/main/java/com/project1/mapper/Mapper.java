package com.project1.mapper;

import com.project1.dto.ContactDto;
import com.project1.model.Contact;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface Mapper {

    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

//    Student dtoToEntity(StudentDto studentDto);
//    StudentDto entityToDto(Student student);

    Contact entityToDto(ContactDto contactDto);
    ContactDto dtoToEntity(Contact contact);

}
