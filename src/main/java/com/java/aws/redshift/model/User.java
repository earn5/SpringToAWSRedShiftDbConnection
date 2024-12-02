package com.java.aws.redshift.model;

//import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
//@Entity
//@Table(name = "venue")
public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "venue_sequence")
//    @SequenceGenerator(name = "venue_sequence", sequenceName = "venue_sequence", allocationSize = 1)
    private int venueid;

    private String venuename;
    private String venuecity;
    private String venuestate;
    private int venueseats;
}
