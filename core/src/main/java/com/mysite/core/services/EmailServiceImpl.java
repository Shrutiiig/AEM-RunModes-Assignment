package com.mysite.core.services;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@Component( service = EmailService.class )
@Designate( ocd = EmailServiceImpl.EmailConfig.class )

public class EmailServiceImpl implements EmailService{

    @ObjectClassDefinition( name = "Email Configuration", description = "Email Configuration" )
    @interface EmailConfig {
        @AttributeDefinition(name = "Email name", description = "Email content")
        String getEmail() default "gmail";
    }
    public void sendEmail(){

    }
}