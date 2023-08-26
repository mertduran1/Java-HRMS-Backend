package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.ApplicationUsers.User;

public interface UserService {
    Result login(User user);
}
