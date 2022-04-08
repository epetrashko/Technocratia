package com.template.technocratia.domain.entities

data class User(
    override val photo: String,
    override val fullName: String,
    override val dateOfBirth: String,
    override val phoneNumber: String,
    override val location: String,
    override val coordinates: String,
) : UserInterface
