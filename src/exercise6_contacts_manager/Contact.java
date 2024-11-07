package exercise6_contacts_manager;

/**
 * Sistema de Agenda de Contactos:
 * Diseña una clase Contacto con atributos nombre, telefono, y email. Luego,
 * crea
 * una clase Agenda que permita agregar, eliminar y buscar contactos por nombre.
 */

public class Contact {

  private String name;
  private String phone;
  private String email;

  public Contact(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }

  // Getter
  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }
}
