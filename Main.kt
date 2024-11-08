package Kotlin_02_ChatBot


fun main(){

    val chatBot = ChatBot()

    println("Welcome to ChatBot! How can I help you? Type 'bye' to exit!")

    var lock = true
    while(lock){
        print("You:")
        val userInput = readLine() ?: ""

        if (userInput.equals("bye", ignoreCase = true) || userInput.equals(" bye", ignoreCase = true)){
            println("ChatBot: ${chatBot.getResponse(userInput)}")
            lock = false
        } else {
            val response = chatBot.getResponse(userInput)
            println("ChatBot: $response")
        }
    }


}