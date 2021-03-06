package com.appointment.dao;


import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author x075093
 *
 */
@Repository
public abstract class AbstractBaseDao implements Serializable {
	
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired   	
	 protected MongoTemplate mongoTemplate;

	    public void setMongoTemplate(MongoTemplate template) {
	        this.mongoTemplate = template;
	    }

	    public MongoTemplate getMongoTemplate() {
	        return this.mongoTemplate;
	    }
}
