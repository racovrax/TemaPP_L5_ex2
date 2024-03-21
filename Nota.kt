package ro.mike.tuiasi

import java.time.LocalDateTime

data class Nota(
    var user: User,
    var data: LocalDateTime,
    var continut: String
)