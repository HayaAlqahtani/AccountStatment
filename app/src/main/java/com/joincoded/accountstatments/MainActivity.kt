package com.joincoded.accountstatments

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.joincoded.accountstatments.Repo.AccountRepo
import com.joincoded.accountstatments.ui.theme.AccountStatmentsTheme
import com.joincoded.accountstatments.uiCompos.AccountCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountStatmentsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.error
                ) {
                    AccountList()

                }
            }
        }
    }
}

@Composable
fun AccountList(modifier: Modifier = Modifier) {
    var accountList = AccountRepo.dummyAccountLists

    LazyColumn {
        item { Text(text = " Details ") }
        itemsIndexed(accountList) { index, account ->
            AccountCard(
                name = account.name,
                transactionType = account.transactionType,
                Amount = account.Amount,
                detail = account.details,
                Date = account.Date,
                modifier = Modifier
                    .background(if (index % 2 == 0) Color.DarkGray else Color.LightGray)
                    .fillMaxWidth()
            )
            Divider()
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AccountStatmentsTheme {
        Greeting("Hello Customers")
    }
}