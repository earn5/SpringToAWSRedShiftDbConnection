package com.java.aws.redshift.controller;

import com.java.aws.redshift.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User getDetails(int id) {
        User user = null;
        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource();
        // Specify the file path
        String filePath = "C://Users/2000135527/Documents/Projects/redshift/file.csv";
        String val = "Toyota Park";
        String sql = "SELECT * FROM venue v WHERE venuename IN('"+val+"')";
//        mapSqlParameterSource.addValue("venueid", id);

        try {
            user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class));
//            user = jdbcTemplate.queryForList(sql);
//            writeUsersToCSV(user, filePath);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(user.toString());
        return user;
    }
}
