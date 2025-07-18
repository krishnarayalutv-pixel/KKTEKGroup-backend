package com.kktekgroup.website.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kktekgroup.website.Dto.ContactDto;
import com.kktekgroup.website.Service.ContactService;

@Controller
public class ContactController {
 
    private final ContactService contactService;
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @PostMapping("/contact")
    public ResponseEntity<String> saveContact(@RequestBody ContactDto contactDto) {

        contactService.saveContact(contactDto);
        return ResponseEntity.ok().body("Contact saved successfully");

    }

}
