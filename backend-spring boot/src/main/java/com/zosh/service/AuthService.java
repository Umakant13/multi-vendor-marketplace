package com.zosh.service;

import com.zosh.exception.SellerException;
import com.zosh.exception.UserException;
import com.zosh.request.LoginRequest;
import com.zosh.request.ResetPasswordRequest;
import com.zosh.request.SignupRequest;
import com.zosh.response.ApiResponse;
import com.zosh.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
