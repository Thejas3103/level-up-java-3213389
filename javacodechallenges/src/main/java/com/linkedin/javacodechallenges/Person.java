package com.linkedin.javacodechallenges;
public class Person {
  public String firstName;
  public String lastName;
  public int age;
  
  public Person(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }
  
  public void setAge(int age) {
    if (age < this.age) {
      System.out.println("Couldn't set new age as it is less than the previous one");
    } else {
      this.age = age;
    }
  }
  public int getAge() {
    return this.age;
  }
  
  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  public void introduceYourself() {
    System.out.println("Hi, I'm" + getFirstName() + " " +
        getLastName() + " and I'm " + getAge()+" years old");
  }

}