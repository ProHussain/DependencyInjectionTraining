package com.training.dependencyinjection

import dagger.Binds
import dagger.Module

@Module
abstract class NotificationServiceModule {
    @Binds
    abstract fun getNotificationService(emailService: EmailService): NotificationService
}