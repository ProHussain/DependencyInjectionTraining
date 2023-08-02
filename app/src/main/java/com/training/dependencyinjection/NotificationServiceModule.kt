package com.training.dependencyinjection

import dagger.Binds
import dagger.Module

@Module
abstract class NotificationServiceModule {
    @Binds
    abstract fun getEmailService(emailService: EmailService): NotificationService

    @SMSAnnotation
    @Binds
    abstract fun getSMSService(smsService: SMSService): NotificationService
}