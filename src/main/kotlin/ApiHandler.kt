package org.example

import okhttp3.*

/*
response code 0 is normal
response code 1 means there's not enough to fill the request, e.g. there's only 2 category 30 easy boolean
(https://opentdb.com/api.php?amount=2&category=30&difficulty=easy&type=boolean) questions so going over amount of 2
will respond with code 1

5 is to many requests in a short period of time(?)
 */
class ApiHandler {

}