package com.kktekgroup.website.Repo;

import com.kktekgroup.website.Model.ContactInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepo extends JpaRepository<ContactInfo, Long> {
    // This interface will automatically provide CRUD operations for ContactInfo entities
     public ContactInfo save(ContactInfo contactInfo);
}
