package ru.tinkoff.allure.model

import java.util.*

/**
 * @author Badya on 14.04.2017.
 */
class StepResult(@Transient val uuid: String = UUID.randomUUID().toString()) : ExecutableItem()