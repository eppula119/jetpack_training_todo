package com.example.jetpackbuylistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackbuylistapp.ui.theme.JetpackBuyListAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint // mainActivityないでHiltの依存関係注入を可能にする
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackBuyListAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.Add, contentDescription = "新規作成")
        }
    }) {

    }
}
