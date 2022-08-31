package com.oscngl.design.patterns.observer;

public class EmailObserver extends Observer{

    private String email;

    public EmailObserver(String email, Subject subject){
        this.email = email;
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Email sent to: " + email + ", Subject: " + subject.getMessage() );
    }

}
