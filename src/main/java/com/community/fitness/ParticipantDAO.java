package com.community.fitness;

import com.community.fitness.Participant;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ParticipantDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/fitness_challenge";
    private static final String USER = "Batman";
    private static final String PASSWORD = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void addParticipant(Participant participant) throws SQLException {
        String sql = "INSERT INTO participants (Name, Email, age, challenge) VALUES (?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, participant.getName());
            stmt.setString(2, participant.getEmail());
            stmt.setInt(3, participant.getAge());
            stmt.setString(4, participant.getChallenge());
            stmt.executeUpdate();
        }
    }

    public List<Participant> getAllParticipants() throws SQLException {
        List<Participant> participants = new ArrayList<>();
        String sql = "SELECT * FROM participants";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Participant participant = new Participant();
                participant.setId(rs.getInt("Id"));
                participant.setName(rs.getString("Name"));
                participant.setEmail(rs.getString("Email"));
                participant.setAge(rs.getInt("age"));
                participant.setChallenge(rs.getString("challenge"));
                participants.add(participant);
            }
        }
        return participants;
    }
}
