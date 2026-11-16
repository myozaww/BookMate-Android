package com.bookmate.reader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MenuBook
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { BookMateApp() }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookMateApp() {
    val books = listOf(
        "Welcome to BookMate" to "Your reading space",
        "EPUB and PDF support" to "Reader integration is the next development step",
        "Myanmar translation" to "Translation and OCR are not implemented in this starter"
    )
    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("BookMate") },
                    navigationIcon = {
                        Icon(Icons.Default.MenuBook, contentDescription = "BookMate",
                            modifier = Modifier.padding(start = 16.dp))
                    }
                )
            }
        ) { padding ->
            LazyColumn(
                modifier = Modifier.fillMaxSize().padding(padding).padding(20.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                item {
                    Text("Your personal library", style = MaterialTheme.typography.headlineSmall)
                    Text("A starter app prepared for cloud APK building.")
                }
                items(books) { (title, subtitle) ->
                    ElevatedCard(Modifier.fillMaxWidth()) {
                        Column(Modifier.padding(18.dp)) {
                            Text(title, style = MaterialTheme.typography.titleMedium)
                            Spacer(Modifier.height(4.dp))
                            Text(subtitle, style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
                item {
                    Text(
                        "Build status: starter scaffold. This is not yet the complete ebook reader.",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}
