package com.joincoded.accountstatments.data


data class Transaction(
    var name: String,
    val transactionType: TransactionType,
    var Amount: Double,
    var details: String, var Date: String
)
