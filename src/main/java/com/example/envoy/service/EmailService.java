package com.example.envoy.service;

import com.example.envoy.dto.EmailResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface EmailService {
    ResponseEntity<EmailResponse> sendMail(String fromEmail, String toEmail, String subject, String body, String[] cc, String[] bcc, String trackEmail);
    void trackMail(String uniqueIdentifier);
}
