package com.example.helloapp.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService
{

        private String storedMessage = "Hello World!!"; // Simple in-memory storage

        // GET method - Retrieve stored message
        public String getMessage() {
            return storedMessage;
        }

        // POST method - Set a new message
        public void setMessage(String message) {
            this.storedMessage = message;
        }

}
