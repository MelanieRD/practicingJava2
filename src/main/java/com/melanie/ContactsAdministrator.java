package com.melanie;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ContactsAdministrator {
    private HashMap<String, Integer> contacts = new HashMap<>();


    ContactsAdministrator(){

    }


    public void addContact(String nameContact, int phoneNumber){
         Integer newContact = contacts.putIfAbsent(nameContact, phoneNumber);
         if(newContact == null){
             System.out.println("Contacto agregado!");
         }
         else {
             System.out.println("Ya existe un contacto con el nombre "+ nameContact);
         }
    }

    public void editContact(String nameContact, int newPhoneNumber){
        try {
            Integer editContact = contacts.computeIfPresent(nameContact, (key, value) -> value = newPhoneNumber);
            if (editContact == null) {
                System.out.println("contact doesn't exist");
            } else {
                System.out.println("contact was succesfully edited");
            }
        } catch (Exception e){
            System.err.println("An error has ocurred"+ e);
        }

    }

    public  Optional<Integer> searchContact(String nameContact){
         if(contacts.containsKey(nameContact)) {
             return  Optional.of(contacts.get(nameContact));
         }
        return  Optional.empty();
    }

     public HashMap<String, Integer> getContacts(){
         return this.contacts;
    }

}
