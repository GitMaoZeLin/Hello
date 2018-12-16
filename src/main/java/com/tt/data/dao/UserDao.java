package com.tt.data.dao;

import com.tt.data.pojo.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer>{


}
