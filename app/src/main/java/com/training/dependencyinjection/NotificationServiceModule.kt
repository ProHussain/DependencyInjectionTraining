package com.training.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class NotificationServiceModule() {
    @ApplicationScope
    @Named("email")
    @Provides
    fun getEmailService(
        @Named("type") notificationType: String,
        @Named("sender") sender: String
    ): NotificationService {
        return EmailService(notificationType,sender)
    }

    @SMSAnnotation
    @Provides
    fun getSMSService(smsService: SMSService): NotificationService {
        return smsService
    }

}