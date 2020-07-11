package com.kaveesh.testApp.dao;

import com.kaveesh.testApp.model.user.AdminUserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<AdminUserEntity,String> {
}
