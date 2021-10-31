package com.asac.helloworld.Repositories;

import com.asac.helloworld.Models.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser,Integer> {
    AppUser findByUsername(String username);
}
