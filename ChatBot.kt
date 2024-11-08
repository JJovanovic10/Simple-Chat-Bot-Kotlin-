package Kotlin_02_ChatBot

class ChatBot {

    fun getResponse(message: String) : String{
        return when{
            message.contains("hello", ignoreCase = true) -> "Hello, How can i help you today?"
            message.contains("how are you", ignoreCase = true) -> "I'm just a bot, but I'm here to help!"
            message.contains("bye", ignoreCase = true) -> "Goodbye! Have a great day!"
            else -> "I'm sorry, I don't understand that."
        }
    }
}