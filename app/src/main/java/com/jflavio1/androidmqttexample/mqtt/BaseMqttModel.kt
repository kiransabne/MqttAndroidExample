package com.jflavio1.androidmqttexample.mqtt

/**
 * BaseMqttModel
 *
 * @author Jose Flavio - jflavio90@gmail.com
 * @since  6/5/17
 */
interface BaseMqttModel {

    fun connectToServer()

    fun disconnectFromServer()

    fun subscribeToTopic(topicName: String)

    fun unsubscribeFromTopic(topicName: String)

}