package com.example.springpoll.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user_results")
public class UserResult {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String userEmail;
   private Time createTime;
   private int resultId;

}
