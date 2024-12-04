package com.community.fitness;

public class Participant {
    private int Id;
    private String Name;
    private String Email;
    private int age;
    private String challenge;

    // Getters and Setters
    public int getId() { return Id; }
    public void setId(int id) { this.Id = Id; }

    public String getName() { return Name; }
    public void setName(String name) { this.Name = Name; }

    public String getEmail() { return Email; }
    public void setEmail(String email) { this.Email = Email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getChallenge() { return challenge; }
    public void setChallenge(String challenge) { this.challenge = challenge; }
}
