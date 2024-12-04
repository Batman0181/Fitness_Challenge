package com.community.fitness;

import com.community.fitness.ParticipantDAO;
import com.community.fitness.Participant;

public class Main {
    public static void main(String[] args) {
        ParticipantDAO dao = new ParticipantDAO();
        Participant participant = new Participant();
        participant.setName("John Doe");
        participant.setEmail("john.doe@example.com");
        participant.setAge(30);
        participant.setChallenge("10K Steps");

        try {
            dao.addParticipant(participant);
            System.out.println("Participant added successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

