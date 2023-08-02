package com.training.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule() {
    @Named("email")
    @Provides
    fun getEmailService(notificationType: String): NotificationService {
        return EmailService(notificationType)
    }

    @SMSAnnotation
    @Provides
    fun getSMSService(smsService: SMSService): NotificationService {
        return smsService
    }

}