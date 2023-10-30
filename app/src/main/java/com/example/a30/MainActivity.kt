package com.example.a30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30.ui.theme.A30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
        /**
         * abcde 0 1 2 3 4 << 2   0 1 2
         * qwer 0 1 2 3  << 1,2
         */
        class Solution {
            fun solution(s: String): String {
                var answer = ""
                var isEven :Boolean = false//짝수인지 아닌지 판별

                if(s.length%2==0) isEven = true

                if(isEven) answer = s[(s.length/2-1).toInt()].toString() + s[(s.length/2).toInt()].toString()
                else answer = s[(s.length/2).toInt()].toString()
                return answer
            }
        }
        val a = Solution()
        a.solution("abcde")
        a.solution("we")
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
    A30Theme {
        Greeting("Android")
    }
}