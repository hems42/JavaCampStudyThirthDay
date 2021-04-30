package com.company.People;


public abstract class Person {

    int id;
    String name;
    String surname;
    String nationalIdentityNumber;
    String address;
    String contact;
    String descreption;





   /**
    * get field
    *
    * @return id
    */
   public int getId() {
      return this.id;
   }

   /**
    * set field
    *
    * @param id
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * get field
    *
    * @return name
    */
   public String getName() {
      return this.name;
   }

   /**
    * set field
    *
    * @param name
    */
   public void setName(String name) {
      this.name = name;
   }

   /**
    * get field
    *
    * @return surname
    */
   public String getSurname() {
      return this.surname;
   }

   /**
    * set field
    *
    * @param surname
    */
   public void setSurname(String surname) {
      this.surname = surname;
   }

   /**
    * get field
    *
    * @return nationalIdentityNumber
    */
   public String getNationalIdentityNumber() {
      return this.nationalIdentityNumber;
   }

   /**
    * set field
    *
    * @param nationalIdentityNumber
    */
   public void setNationalIdentityNumber(String nationalIdentityNumber) {
      this.nationalIdentityNumber = nationalIdentityNumber;
   }

   /**
    * get field
    *
    * @return address
    */
   public String getAddress() {
      return this.address;
   }

   /**
    * set field
    *
    * @param address
    */
   public void setAddress(String address) {
      this.address = address;
   }

   /**
    * get field
    *
    * @return contact
    */
   public String getContact() {
      return this.contact;
   }

   /**
    * set field
    *
    * @param contact
    */
   public void setContact(String contact) {
      this.contact = contact;
   }

   /**
    * get field
    *
    * @return descreption
    */
   public String getDescreption() {
      return this.descreption;
   }







   // to string override...

   @Override
   public String toString() {
      return
              "id=" + id +
                      ", name='" + getName() + '\'' +

                      ", surname='" + getSurname() + '\'' +
                      ", descreption='" + getDescreption() + '\'';
   }
}
