package entities

case class Question(id: String, title: String, text: String)

case class QuestionUpdate(title: Option[String], text: Option[String])
