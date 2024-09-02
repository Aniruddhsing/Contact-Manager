package com.example.contactList.ContactApp.Repository;

import com.example.contactList.ContactApp.Entiity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String> {
}
