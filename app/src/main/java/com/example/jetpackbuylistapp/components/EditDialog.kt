package com.example.jetpackbuylistapp.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EditDialog(isShowDialog: MutableState<Boolean>) {
    AlertDialog(
        onDismissRequest = { isShowDialog.value = false },
        title = { Text(text = "新規作成") },
        text = {
           Column {
               Text(text = "品名")
               TextField(value = "", onValueChange = { /*TODO*/ })
               Text(text = "カテゴリー")
               TextField(value = "", onValueChange = { /*TODO*/ })
               
           }
        },
        buttons = {
            Row(modifier = Modifier.padding(8.dp),
            horizontalArrangement = Arrangement.Center) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { isShowDialog.value = false },
                ) {
                    Text(text = "キャンセル")
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(
                    modifier = Modifier.width(120.dp),
                    onClick = { isShowDialog.value = false }
                    /*TODO*/
                ) {
                    Text(text = "OK")
                }
            }
        }
    )
}