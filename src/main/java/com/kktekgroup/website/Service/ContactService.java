package com.kktekgroup.website.Service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.kktekgroup.website.Dto.ContactDto;
import com.kktekgroup.website.Model.ContactInfo;
import com.kktekgroup.website.Repo.ContactRepo;


@Service
public class ContactService {


    ContactRepo contactRepo;
    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public void saveContact(ContactDto contact) {
        ContactInfo contactInfo = ContactInfo.builder()
                .fullName(contact.getFullName())
                .email(contact.getEmail())
                .company(contact.getCompany())
                .subject(contact.getSubject())
                .message(contact.getMessage())
                .createdAt(LocalDateTime.now()) // Assuming you want to set the current time as createdAt
                .build();

        contactRepo.save(contactInfo);
        

      
    }
    
}
