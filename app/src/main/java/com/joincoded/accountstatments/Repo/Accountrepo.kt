package com.joincoded.accountstatments.Repo
    import com.joincoded.accountstatments.data.Transaction
    import com.joincoded.accountstatments.data.TransactionType

    class AccountRepo {
        companion object{



            var dummyAccountLists = listOf(Transaction("Haya",TransactionType.WITHDRAW,1300.0,"chanel","24-1-2024")
                ,Transaction("Haya",TransactionType.WITHDRAW,1300.0,"KNET","25-1-2024"),
                Transaction("Haya",TransactionType.DEPOSIT,500.0,"ATM","21-1-2024"))

        }
    }