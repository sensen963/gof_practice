package org.example

import Request
import ResourceCheckHandler
import UserAccessCheckedHandler

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var accessCheckers = listOf(UserAccessCheckedHandler(), ResourceCheckHandler())
    var request = Request("Bob", "Please, call Mary")
    var responses = accessCheckers.map { checker -> checker.handle(request) }
    responses.forEach{response -> println(response.body)}
}