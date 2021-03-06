package com.zadentech.spring.training.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * PersonDAO
 */
@Repository
public class PersonDAO {

    @Autowired
    JdbcConnection jdbcConnection;

    public JdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(JdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
    
}