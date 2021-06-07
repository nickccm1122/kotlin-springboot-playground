package com.nickccm.kotlinspringbootplayground

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
@ConfigurationProperties()
data class Properties(val appName: String = "app") {}
