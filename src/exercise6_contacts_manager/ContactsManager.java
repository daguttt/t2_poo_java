package exercise6_contacts_manager;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Sistema de Agenda de Contactos:
 * Diseña una clase Contacto con atributos nombre, telefono, y email. Luego,
 * crea
 * una clase Agenda que permita agregar, eliminar y buscar contactos por nombre.
 */

public class ContactsManager {

  private final ArrayList<Contact> contacts = new ArrayList<>();

  public void addContact(Contact contact) {
    contacts.add(contact);
  }

  public void removeContact(Contact contact) {
    contacts.remove(contact);
  }

  public Optional<Contact> searchContact(String name) {
    return contacts.stream().filter(contact -> contact.getName().equals(name)).findFirst();
  }

  public void printContacts() {
    System.out.printf("""

        Lista de contactos

        | %-10s | %-11s | %-25s |
        """, "Name", "Phone", "Email");
    contacts.forEach(contact -> System.out.printf("| %-10s | %-11s | %-25s |\n", contact.getName(), contact.getPhone(),
        contact.getEmail()));
  }
}
