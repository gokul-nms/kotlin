fun main() {
    val calculator = Calculator()
    val slackNotifier = SlackNotifier("https://hooks.slack.com/services/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")

    val a = 10.0
    val b = 2.0
    val result = calculator.divide(a, b)

    val message = "Calculated $a / $b = $result"
    println(message)

    slackNotifier.sendMessage("Hello from MY Test Case Passed")
}



