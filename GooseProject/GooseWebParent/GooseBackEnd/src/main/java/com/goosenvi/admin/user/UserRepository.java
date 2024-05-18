package com.goosenvi.admin.user;

import com.goosenvi.common.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
