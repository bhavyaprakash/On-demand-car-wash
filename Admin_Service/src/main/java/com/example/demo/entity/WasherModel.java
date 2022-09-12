package com.example.demo.entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WasherModel {
        @Id
        private String id;
        private String username;
        private String washerRating;
        private String washerEmail;
}

