package com.example.demo.entities;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TODO {

  private Long id;
  private String title;
  private String body;
}
