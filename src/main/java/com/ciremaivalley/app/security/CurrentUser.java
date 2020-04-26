package com.ciremaivalley.app.security;

import com.ciremaivalley.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
