import java.net.HttpURLConnection
import java.net.URL
import java.nio.charset.StandardCharsets

class SlackNotifier(private val webhookUrl: String) {
    fun sendMessage(message: String) {
        val url = URL(webhookUrl)
        val connection = url.openConnection() as HttpURLConnection
        connection.requestMethod = "POST"
        connection.doOutput = true
        connection.setRequestProperty("Content-Type", "application/json")

        val jsonPayload = """{"text": "$message"}"""
        val outputBytes = jsonPayload.toByteArray(StandardCharsets.UTF_8)
        connection.outputStream.use { it.write(outputBytes) }

        val responseCode = connection.responseCode
        if (responseCode != 200) {
            throw RuntimeException("Failed to send message to Slack: HTTP response code $responseCode")
        }
    }
}
